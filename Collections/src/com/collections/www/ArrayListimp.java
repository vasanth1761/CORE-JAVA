package com.collections.www;
import java.util.*;

public class ArrayListimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer>alist=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
//			alist.add(sc.nextInt());
			alist.add(i);
			System.out.println(alist.get(i));
		}
		System.out.println("before adding \n"+alist);
		alist.add(45);
		alist.add(46);
		System.out.println("after adding \n"+alist);
		System.out.println("getting 4 th value:"+alist.get(3));
		alist.set(0,1001 );
		System.out.println("the  updated value :"+alist);
		
		System.out.println("contains:"+alist.contains(1001));
		
		for( int j:alist)
		{
			System.out.println(j);
		}
		Iterator <Integer> i= alist.iterator();
		System.out.print("The first value is:");
		System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(alist);
			return;
		}
	   

	}

}
