package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // here we are creating a al object class

		for (int i = 0; i < 10; i++)
			al.add(i); // here add is the method used add elements in the arraylist

		System.out.println("Elements of ArrayList : " + al);
		
		Iterator itr = al.iterator(); // object of the iterator

		System.out.println("Starting Iterator");
		// checking the next element availabilty
		while (itr.hasNext()) {
			// moving cursor to next element
			int i = (Integer) itr.next();// type casting as it will return the integer to print all the integers in the array 

			// getting even elements one by one
			System.out.print(i + " ");

			// Removing odd elements
			if (i % 2 != 0) // if i not a even number then remove it
				itr.remove(); // it will remove all the element which comes inside this loop as i = 3 % 2 = 1.23 and ! this is not so it is not equal to zero it will go inside the loop
		}
		System.out.println();
		System.out.println("Elements after remove Operation: " + al);

	}

}