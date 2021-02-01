package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("TWO");
		al.add("Three");
		al.add("one");
		printArrayWithIterator(al);
		printArrayWithForLoop(al);
	}

	public static void printArrayWithIterator(ArrayList a) {
		System.out.println("PrintingArray with Iterator:");
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void printArrayWithForLoop(ArrayList a) {
		System.out.println("PrintingArray with For Loop:");
		for(Object i: a) {
			System.out.println(i);
		}
	}
	
	
}
