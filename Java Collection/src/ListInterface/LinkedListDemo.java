package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {


		LinkedList list = new LinkedList();// here the array is not defined so we can add any type of data
		
		list.add(12);
		list.add(100);
		list.add("Java");
		list.add("Tutorial");
		list.add(88);
		list.add("Collection");
		list.add(123);
		list.add(9898);
		list.add(56);
		
		System.out.println(list);
		list.addFirst("Suraj");
		System.out.println(list);
		list.addLast("DP");
		System.out.println(list);
		
		
		
		
		
	}

}
