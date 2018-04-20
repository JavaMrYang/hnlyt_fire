package com.hdkj.lyt.hnlyt_fire.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import javax.servlet.http.HttpServletRequest;

public class MacUtil {

	public static String getMac(HttpServletRequest request) throws IOException {
		String sip = "";
		String smac = "";
		sip = request.getHeader("x-forwarded-for");
		if (sip == null || sip.length() == 0 || "unknown".equalsIgnoreCase(sip)) {
			sip = request.getHeader("proxy-Client-IP");
		}
		if (sip == null || sip.length() == 0 || "unknown".equalsIgnoreCase(sip)) {
			sip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (sip == null || sip.length() == 0 || "unknown".equalsIgnoreCase(sip)) {
			sip = request.getRemoteAddr();
		}
		// 本机过滤掉
		if (!"127.0.0.1".equals(sip)) {
			Process process = Runtime.getRuntime().exec("nbtstat -a " + sip);
			InputStreamReader ir = new InputStreamReader(
					process.getInputStream());
			LineNumberReader input = new LineNumberReader(ir);
			String line;
			while ((line = input.readLine()) != null)
				if (line.indexOf("MAC Address") > 0) {
					smac = line.substring(line.indexOf("-") - 2);
				}
		}
		return smac;
	}
}
