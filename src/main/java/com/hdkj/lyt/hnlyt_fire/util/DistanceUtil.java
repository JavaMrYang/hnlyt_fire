package com.hdkj.lyt.hnlyt_fire.util;

import java.util.ArrayList;
import java.util.List;

import com.hdkj.lyt.hnlyt_fire.model.Point;

/**
 * 计算2点间的距离
 * @author Administrator
 *
 */
public class DistanceUtil {
	/**
     * 地球赤道半径(km)
     * */
    public final static double EARTH_RADIUS = 6378.137;
    /**
     * 地球每度的弧长(km)
     * */
    public final static double EARTH_ARC = 111.199;
    /**
     * 转化为弧度(rad)
     * */
    public static double rad(double d) {
        return d * Math.PI / 180.0;
    }

        
	
	/**
     * 求两经纬度距离
     * 
     * @param lon1
     *            第一点的经度
     * @param lat1
     *            第一点的纬度
     * @param lon2
     *            第二点的经度
     * @param lat2
     *            第二点的纬度
     * @return 两点距离，单位km
     * */
    public static double getDistanceOne(double lon1, double lat1, double lon2,
            double lat2) {
        double r1 = rad(lat1);
        double r2 = rad(lon1);
        double a = rad(lat2);
        double b = rad(lon2);
        double s = Math.acos(Math.cos(r1) * Math.cos(a) * Math.cos(r2 - b)
                + Math.sin(r1) * Math.sin(a))
                * EARTH_RADIUS;
        return s;
    }
	
    /**
     * 获取护林员巡护长度
     * @param list
     * @return
     */
    public static double countLength(List<Point> list){
    	if(list.size()<=1){
    		return 0;
    	}
    	double sum = 0;
    	Point p0 = list.remove(0);
    	for(Point p:list){
    		sum = sum + getDistanceOne(p0.getLng(), p0.getLat(), p.getLng(), p.getLat());
    		p0 = p;
    	}
    	return sum;
    }
    
    public static void main(String[] args) {
    	List<Point> list = new ArrayList<Point>();
    	Point p = new Point();
    	p.setLat(28.185297);
    	p.setLng(113.418822);
    	list.add(p);
    	
    	Point p1 = new Point();
    	p1.setLat(28.185275);
    	p1.setLng(113.218968);
    	list.add(p1);
    	
    	Point p2 = new Point();
    	p2.setLat(28.185287);
    	p2.setLng(113.318852);
    	list.add(p2);
    	
    	Point p3 = new Point();
    	p3.setLat(28.185297);
    	p3.setLng(113.618822);
    	list.add(p3);
    	double a = countLength(list);
    	System.out.println(a);
	}
}
