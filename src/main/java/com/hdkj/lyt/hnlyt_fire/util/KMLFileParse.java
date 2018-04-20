package com.hdkj.lyt.hnlyt_fire.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;

import com.hdkj.lyt.hnlyt_fire.model.Kml;


/**
 *  解析KML文件
 * @author Administrator
 *
 */
public class KMLFileParse{
	public static Kml parseKml(String path) {  
        SAXReader reader = new SAXReader();  
        reader.setEncoding("utf-8");  
//        Document document;  
        try {  
            Document document = reader.read(new File(path));
            Element root = document.getRootElement();//得到xml跟标签，此处是<root></root>  
            List<Element> list = root.elements("Document");  
            Kml k = new Kml();
            for (Element e : list) {
                Element folder = e.element("Folder");  
                Element gps = folder.element("Region").element("LatLonAltBox");
                
                Element gl = folder.element("GroundOverlay");
//                data[i].west, data[i].south
                double[] ws = GPSUtils.gps84_To_Gcj02(Double.parseDouble(gps.element("south").getText()), 
                		Double.parseDouble(gps.element("west").getText()));
                k.setWest(ws[1]+"");
                k.setSouth(ws[0]+"");
                
                double[] en = GPSUtils.gps84_To_Gcj02(Double.parseDouble(gps.element("north").getText()), 
                		Double.parseDouble(gps.element("east").getText()));
                k.setEast(en[1]+"");
                k.setNorth(en[0]+"");
                
                String imagePath = gl.element("Icon").element("href").getText().substring(5);
                k.setImagePath(imagePath);
            }
            return k;
        } catch (DocumentException e) {  
            e.printStackTrace();  
        }  
        return null;
    }  
		
	public static void main(String[] args) {
//		xmlTest();
		parseKml("D:\\workSpace\\eclipse\\HNLYT\\WebRoot\\google_tiles\\13\\6645\\4763.kml");
//		String zoom = "13";
//		File f = new File("D:\\workSpace\\eclipse\\HNLYT\\WebRoot\\google_tiles\\"+zoom);
//		String[] flist = f.list();
//		
//		for(String str:flist){
//			System.out.println(str);
//		}
	}
}
