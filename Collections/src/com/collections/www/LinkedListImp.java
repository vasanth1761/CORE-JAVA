package com.collections.www;
import java.util.*;

public class LinkedListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		for(int i=0;i<5;i++)
		{
			l.add(sc.next());
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(l.get(i));
		}
		l.add("vasanth");
		System.out.println(l);
		l.addFirst("chandru");
		System.out.println("The first is:"+l);
		l.addLast("pranesh");
		System.out.println("The Last  is:"+l);
		l.set(0,"vasanth");
		System.out.println(l);
		

	}

}
