package com.hdkj.lyt.hnlyt_fire.util;//package com.hdkj.lyt.hnlyt_fire.util;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.net.Socket;
//import java.net.UnknownHostException;
//
//import org.slf4j.Logger;
//
//public class MySocket {
//	private static Logger logger = LoggerFactory.getLogger(MySocket.class);
//	
//	public static void main(String[] args) {
////		
//		String str = createSocket("117.61.129.171", 18730, "ff878.f_12345_0.19593653082847595m_28.230753_113.055432_huangjz.a_0");
//		System.out.println(str);
//	}
//	
//	public static String createSocket(String ip,int port,String context){
//		try {
//	         Socket s = new Socket(ip,port);
//	         //构建IO
//	         InputStream is = s.getInputStream();
//	         OutputStream os = s.getOutputStream();
//	         
//	         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
//	         //向服务器端发送一条消息
//	         
//	         bw.write(context+"\n");
//	         bw.flush();
//	         
//	         //读取服务器返回的消息
//	         BufferedReader br = new BufferedReader(new InputStreamReader(is));
//	         String mess = br.readLine();
//	         return mess;
//	      } catch (UnknownHostException e) {
//	    	  logger.error(e);
//	         e.printStackTrace();
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	         logger.error(e);
//	      }
//		return null;
//	}
//}
