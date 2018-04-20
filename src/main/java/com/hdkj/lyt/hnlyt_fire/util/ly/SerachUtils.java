package com.hdkj.lyt.hnlyt_fire.util.ly;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SerachUtils {
public static List<String> getTotalUserTypeByType(String userType,Map<String,Object> map){
	List<String> typeList=new ArrayList<String>();
	if(userType!=null){	
			int index=0;
			while(userType.contains("1")){
				index=userType.indexOf("1");
				userType=userType.replaceFirst("1", "0");		
			    typeList.add((index+1)+"");				
		  }
	}
	return typeList;
}
public static void main(String[] args) {
	String str="00011";
	String appType="01000";
	StringBuilder validate=new StringBuilder(str);
	if(appType.indexOf("1")>0){
		int index=appType.indexOf("1");
		validate.replace(index, index+1, "1");
	}
	System.out.println(validate.toString());
	System.out.println(str.charAt(2));
}
}
