package com.hdkj.lyt.hnlyt_fire.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileUtil {
	static OutputStream out;
	public static BufferedReader getBufferedReader(String fileName) throws FileNotFoundException{
		BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
		return read;
	}
	
	public static OutputStream getOut(String fileName) throws FileNotFoundException{
		if(out == null){
			out = new FileOutputStream(new File(fileName),true);
		}
		
		return out;
	}

	public static void writer(byte[] data) throws IOException {
		out = getOut("d:/hjz_test.mp4");
		out.write(data);
		out.flush();
	}
}
