package com.hdkj.lyt.hnlyt_fire.util;

import java.io.IOException;

import sun.misc.BASE64Decoder;

public class GpsUtil {
	public static String base64ToStr(String base64) throws IOException{
		BASE64Decoder decoder = new BASE64Decoder();
		if("".equals(base64) || base64 == null){
			return "";
		}
		String str = new String(decoder.decodeBuffer(base64));
		return str;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(base64ToStr("MTEzLjA1OTMwMTE5OTU1"));
		System.out.println(base64ToStr("MjguMjM1OTU3MzM5MDE1"));
	}
}
