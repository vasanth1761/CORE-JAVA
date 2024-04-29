package com.collections.www;
import java.util.*;

public class HashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> h=new HashSet<String>();
    h.add("Ram");
    h.add("Conjuring");
    h.add("Anbelle");
    h.add("nun");
    h.add("nun");
    h.add("groundfloor lady ghost");
    System.out.println("Hashset:"+h);
	
	TreeSet<String> ts= new TreeSet<String>();
	
	ts.add("Ram");
    ts.add("Conjuring");
    ts.add("Anbelle");
    ts.add("nun");
    ts.add("nun");
    ts.add("groundfloor lady ghost");
    System.out.println("treeset:"+ts);
	   
    

}
}
