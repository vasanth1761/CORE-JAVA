package com.collections.www;
import java.util.*;

public class QueueImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(4);
		q.add(67);
		q.add(89);
		q.add(1);
		
		System.out.println(q);
		System.out.println("the head is:"+q.peek());
		System.out.println("the removed:"+q.poll());
		System.out.println("the head is :"+q.peek());
		System.out.println("The size is:"+q.size());
        System.out.println(q);
	}

}
