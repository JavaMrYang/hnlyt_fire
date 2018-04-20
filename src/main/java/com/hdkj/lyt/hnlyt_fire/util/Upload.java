package com.hdkj.lyt.hnlyt_fire.util;//package com.hdkj.lyt.hnlyt_fire.util;
//
//
//import java.io.DataOutputStream;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.LineNumberReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Upload {
//	/* 上传文件至Server的方法 */
//	/**
//	 * 
//	 * @param localFilePath
//	 * @param uploadFilePath
//	 * @throws Exception
//	 */
//	public static void uploadFile(String localFilePath, String uploadFilePath)
//			throws Exception {
//		String actionUrl = "http://"+ MainActivity.serverIp+":"+ MainActivity.tomcatPort+"/"+ MainActivity.serverName+"/uploadFile.htm";
////		String actionUrl = "http://192.168.43.184:8080/androidFileUpload/uploadFile.htm";
//		String end = "\r\n";
//		String twoHyphens = "--";
//		String boundary = "*****";
//		// try {
//		URL url = new URL(actionUrl);
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		/* 允许Input、Output，不使用Cache */
//		con.setDoInput(true);
//		con.setDoOutput(true);
//		con.setUseCaches(false);
//		/* 设置传送的method=POST */
//		con.setRequestMethod("POST");
//		/* setRequestProperty */
//		con.setRequestProperty("Connection", "Keep-Alive");
//		con.setRequestProperty("Charset", "UTF-8");
//		con.setRequestProperty("Content-Type", "multipart/form-data;boundary="
//				+ boundary);
//		/* 设置DataOutputStream */
//		DataOutputStream ds = new DataOutputStream(con.getOutputStream());
//		ds.writeBytes(twoHyphens + boundary + end);
//		ds.writeBytes("Content-Disposition: form-data; "
//				+ "name=\"file1\";filename=\"" + uploadFilePath + "\"" + end);
//		ds.writeBytes(end);
//		/* 取得文件的FileInputStream */
//		FileInputStream fStream = new FileInputStream(localFilePath);
//		/* 设置每次写入1024bytes */
//		int bufferSize = 1024;
//		byte[] buffer = new byte[bufferSize];
//		int length = -1;
//		/* 从文件读取数据至缓冲区 */
//		while ((length = fStream.read(buffer)) != -1) {
//			/* 将资料写入DataOutputStream中 */
//			ds.write(buffer, 0, length);
//		}
//		ds.writeBytes(end);
//		ds.writeBytes(twoHyphens + boundary + twoHyphens + end);
//		/* close streams */
//		fStream.close();
//		ds.flush();
//		/* 取得Response内容 */
//		InputStream is = con.getInputStream();
//		int ch;
//		StringBuffer b = new StringBuffer();
//		while ((ch = is.read()) != -1) {
//			b.append((char) ch);
//		}
//		System.out.println("====上传成功！=====" + b.toString().trim());
//		/* 将Response显示于Dialog */
//		// showDialog("上传成功"+b.toString().trim());
//		/* 关闭DataOutputStream */
//		ds.close();
//		// } catch (Exception e) {
//		// e.printStackTrace();
//		// System.out.println("====上传失败！=====");
//		// // showDialog("上传失败"+e);
//		// }
//	}
//
//	public static void manyFileUpload(List<String> fileList) throws Exception {
//		// List<String> fileList = new ArrayList<String>();
//		// fileList.add("e:/123.jpg");
//		// fileList.add("e:/234.jpg");
//		// fileList.add("e:/345.jpg");
//		// fileList.add("f:/123.rar");
//		// fileList.add("E:\\A安装包\\wps2013.exe");
//		// fileList.add("E:\\MTCRun_autoUpdate\\TimeSyncClint.rar");
//		// fileList.add("e:/tb_alarmcode.txt");
//		// fileList.add("C:\\Users\\Administrator\\Desktop\\tb_XTCardBlackBaseList_send(500w).rar");
//		for (String s : fileList) {
//			uploadFile(s, s);
//		}
//	}
//
//	// private static String tag = "chz";
//
//	// Android系统2.3版本以上可以通过下面的方法得到Serial Number，
//	// 且非手机设备也可以通过该接口获取
//	public static String GetSerialNumber() {
//		String SerialNumber = android.os.Build.SERIAL;
//		// Log.i(tag, SerialNumber);
//		return SerialNumber;
//	}
//
//	// 手机Wifi的MAC地址作为设备标识
//	public static String getMac() {
//		String macSerial = null;
//		String str = "";
//		try {
//			Process pp = Runtime.getRuntime().exec(
//					"cat /sys/class/net/wlan0/address ");
//			InputStreamReader ir = new InputStreamReader(pp.getInputStream());
//			LineNumberReader input = new LineNumberReader(ir);
//
//			for (; null != str;) {
//				str = input.readLine();
//				if (str != null) {
//					// 只允许字母和数字
//					// String regEx = "[^a-zA-Z0-9]";
//					// 清除掉所有特殊字符
//					String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
//					Pattern p = Pattern.compile(regEx);
//					Matcher m = p.matcher(str);
//					macSerial = m.replaceAll("").trim();
//					break;
//				}
//			}
//		} catch (IOException ex) {
//			// 赋予默认值
//			ex.printStackTrace();
//		}
//		// Log.i(tag, macSerial);
//		return macSerial;
//	}
//
//	public static String getDeviceId(Context context) {
//		TelephonyManager tm = (TelephonyManager) context
//				.getSystemService(Context.TELEPHONY_SERVICE);
//		String DEVICE_ID = tm.getDeviceId();
//		// Log.i(tag, DEVICE_ID);
//		return DEVICE_ID;
//	}
//
//	/**
//	 * 获取CPU序列号
//	 * 
//	 * @return CPU序列号(16位) 读取失败为"0000000000000000"
//	 */
//	public static String getCPUSerial() {
//		String str = "", strCPU = "", cpuAddress = "0000000000000000";
//		try {
//			// 读取CPU信息
//			Process pp = Runtime.getRuntime().exec("cat /proc/cpuinfo");
//			InputStreamReader ir = new InputStreamReader(pp.getInputStream());
//			LineNumberReader input = new LineNumberReader(ir);
//			// 查找CPU序列号
//			// for (int i = 1; i
//			str = input.readLine();
//			if (str != null) {
//				// 查找到序列号所在行
//				if (str.indexOf("Serial") > -1) {
//					// 提取序列号
//					strCPU = str.substring(str.indexOf(":") + 1, str.length());
//					// 去空格
//					cpuAddress = strCPU.trim();
//					// break;
//					// }
//				} else {
//					// 文件结尾
//					// break;
//				}
//			}
//		} catch (IOException ex) {
//			// 赋予默认值
//			ex.printStackTrace();
//		}
//		return cpuAddress;
//	}
//}
