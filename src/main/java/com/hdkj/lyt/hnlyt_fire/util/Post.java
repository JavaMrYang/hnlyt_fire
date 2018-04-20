package com.hdkj.lyt.hnlyt_fire.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import com.hdkj.lyt.hnlyt_fire.model.data.LoginData;

public class Post {
	/**
     * ͨ����ַ��ȡ��ݡ�
     *
     * @param url
     * @return json��ݸ�ʽ
     */
    public static String posturl(String url) throws IOException {
        InputStream is = null;
        StringBuffer sb = new StringBuffer();
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);
        HttpResponse response = httpclient.execute(httppost);

        HttpEntity entity = response.getEntity();

        is = entity.getContent();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader( is, "utf-8"));

            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            is.close();

        } catch (Exception e) {
            return null;
        }finally{
        	if(is != null){
        		is.close();
        	}
        	if(reader != null){
        		reader.close();
        	}
        }

        return sb.toString();

    }
    public static String posturl(String url,List<NameValuePair> nvps) throws IOException {
        InputStream is = null;
        StringBuffer sb = new StringBuffer();
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);
        try{
//        	UrlEncodedFormEntity u = new UrlEncodedFormEntity(nvps,HTTP.UTF_8);
        	httppost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
        	System.out.println("111111111111111111");
        } catch(Exception e){
        	System.out.println("00000000000000000");
        	e.printStackTrace();
        }
//       System.out.println(u);
       System.out.println(httppost);
//        httppost.setEntity(new UrlEncodedFormEntity(nvps));  
        HttpResponse response = httpclient.execute(httppost);
        
        HttpEntity entity = response.getEntity();

        is = entity.getContent();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader( is, "utf-8"));

            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            is.close();

        } catch (Exception e) {
            return null;
        }finally{
        	if(is != null){
        		is.close();
        	}
        	if(reader != null){
        		reader.close();
        	}
        }

        return sb.toString();

    }
    /**
     * 复制服务器上的html代码，保存到本地磁盘
     * @param url 服务器地址
     * @param savePath 本地磁盘地址
     * @return
     * @throws IOException
     */
    public static void copyHtml(String url, String savePath) throws IOException {
        InputStream is = null;
//        StringBuffer sb = new StringBuffer();
        
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);
        HttpResponse response = httpclient.execute(httppost);

        HttpEntity entity = response.getEntity();

        is = entity.getContent();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(savePath)));
            String line = null;

            while ((line = reader.readLine()) != null) {
//                sb.append(line).append("\n");
                writer.write(line+"\n");
                writer.flush();
            }
            is.close();

        } catch (Exception e) {
        	e.printStackTrace();
        }finally{
        	if(is != null){
        		is.close();
        	}
        	if(reader != null){
        		reader.close();
        	}
        }
    }
    private static void login(String url,List<NameValuePair> nvps){
    	try {
			String str = posturl(url,nvps);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    private static void file() throws IOException{
    	String url = "http://219.239.221.19/infotemp/581450581/22101638.xls";
    	String str = posturl(url);
		System.out.println(str);
    }
    
    private static void getFile() throws IOException{
    	String url = "http://219.239.221.19/cffm_office/watch/watch_image_display_station.asp";
    	List<NameValuePair> nvps = new ArrayList<NameValuePair>();  
        nvps.add(new BasicNameValuePair("ID", "161194"));  
        nvps.add(new BasicNameValuePair("SysIFF", "581450581")); 
    	String str = posturl(url,nvps);
		System.out.println(str);
    }
    
    public static void main(String[] args) throws Exception {
//    	String url = "http://127.0.0.1:8080/HNLYT/getTaskList.htm";
//    	String url = "http://117.78.35.70:8886/socket/inspectionReq?billId=20170930153547923233&padId=15010043474e443352069dd3f42692b9&stationId=101&stationLane=2";
//		String str = posturl(url);
//		System.out.println(str);
    	String url = "http://219.239.221.19/cffm_office/fpinfo.asp";
    	List<NameValuePair> nvps = new ArrayList<NameValuePair>();  
        nvps.add(new BasicNameValuePair("Login", "hniu"));  
        nvps.add(new BasicNameValuePair("Password", "password")); 
    	login(url,nvps);
    	
    	file();
    	
//    	getFile();
	}
    
    
    
}
