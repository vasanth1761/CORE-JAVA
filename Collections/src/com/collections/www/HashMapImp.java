package com.collections.www;
import java.util.*;

public class HashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();   
        System.out.println("Printing List of vehicles using map:");
        map.put(1, "car");
        map.put(2, "bike");
        map.put(3, "bicycle");
        map.put(4, "bus");
        map.put(5, "train");
        map.put(6, "Aeroplane");
        map.put(1, "ship");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println("size of the map is:");
        System.out.println(map.size());
       
	}

}
