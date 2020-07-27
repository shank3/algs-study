/**
 * IPHelper.java
 * <br>Copyright：Copyright(c)2014
 * <br>Company：北京畅行信息技术有限公司
 * <br>2018年11月20日 上午10:25:55
 * <br>@version1.1
 */
package util;

import java.util.Optional;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IPHelper {

	private static ThreadLocal<String> local = new ThreadLocal<>();
	
	private static Logger logger = LoggerFactory.getLogger(IPHelper.class);
	
	private static final String ALL_IP_REGEX = "(?=(\\b|\\D))(((\\d{1,2})|(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))(?=(\\b|\\D))";
	private static Pattern pattern = Pattern.compile(ALL_IP_REGEX);
	
	private IPHelper() {
	}
	
	static void setCurrentIP(String ip) {
		logger.debug("ip from request header : {}", ip);
		if (StringUtils.isNoneBlank(ip)) {
			String firstIp = ip;
			if (ip.contains(",")) {
				firstIp = ip.substring(0, ip.indexOf(","));
			}
			boolean match = pattern.matcher(firstIp).matches();
			if (match) {
				local.set(firstIp);
			} else {
				logger.warn("invalid ip:{} from request header", ip);
				local.set(null);
			}
		} else {
			local.set(null);
		}
	}
	
	public static Optional<String> getRequestIp() {
		return Optional.ofNullable(local.get());
	}
	
	public static boolean isFromTrustedIP() {
		boolean trusted = false;
		Optional<String> requestIp = getRequestIp();
		if (requestIp.isPresent()) {
			trusted = isSiteLocalIP(requestIp.get());
			if (!trusted) {
				trusted = ConfigUtil.getWhiteIPs().contains(requestIp.get());
			}
			if (trusted) {
				logger.debug("white ip:{}", requestIp.get());
			}
		}
		return trusted;
	}
	
	static boolean isSiteLocalIP(String ip) {
		boolean is = false;
		byte[] arr = textToNumericFormatV4(ip);
		if (arr != null) {
			int i = arr[3] & 0xFF;
			i |= arr[2] << 8 & 0xFF00;
			i |= arr[1] << 16 & 0xFF0000;
			i |= arr[0] << 24 & 0xFF000000;
			is = ((i >>> 24 & 0xFF) == 10) || (((i >>> 24 & 0xFF) == 172) && ((i >>> 16 & 0xF0) == 16))
			|| (((i >>> 24 & 0xFF) == 192) && ((i >>> 16 & 0xFF) == 168));
		}
		return is;
	}
	
	
	private static byte[] textToNumericFormatV4(String paramString) {
		byte[] arrayOfByte = new byte[4];

		long l = 0L;
		int i = 0;
		int j = 1;

		int k = paramString.length();
		if ((k == 0) || (k > 15)) {
			return null;
		}
		for (int m = 0; m < k; m++) {
			char c = paramString.charAt(m);
			if (c == '.') {
				if ((j != 0) || (l < 0L) || (l > 255L) || (i == 3)) {
					return null;
				}
				arrayOfByte[(i++)] = ((byte) (int) (l & 0xFF));
				l = 0L;
				j = 1;
			} else {
				int n = Character.digit(c, 10);
				if (n < 0) {
					return null;
				}
				l *= 10L;
				l += n;
				j = 0;
			}
		}
		if ((j != 0) || (l < 0L) || (l >= 1L << (4 - i) * 8)) {
			return null;
		}
		switch (i) {
			case 0 :
				arrayOfByte[0] = ((byte) (int) (l >> 24 & 0xFF));
			case 1 :
				arrayOfByte[1] = ((byte) (int) (l >> 16 & 0xFF));
			case 2 :
				arrayOfByte[2] = ((byte) (int) (l >> 8 & 0xFF));
			case 3 :
				arrayOfByte[3] = ((byte) (int) (0xFF));
		}
		return arrayOfByte;
	}
	
}
