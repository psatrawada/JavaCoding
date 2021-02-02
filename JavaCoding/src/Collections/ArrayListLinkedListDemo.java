package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListDemo {

	public static void main(String[] args) {
		long sTimeAL = System.currentTimeMillis();
		for (int i = 0; i<10000; i++) {
			ArrayList al = new ArrayList();
			al.add(i);			
		}	
		long eTimeAL = System.currentTimeMillis();
		long diffAL = eTimeAL-sTimeAL;
		System.out.println("ArrayList took : "+ diffAL);
		
		long sTime_LL = System.currentTimeMillis();
		
		for (int i = 0; i<10000; i++) {
			LinkedList ll = new LinkedList();
			ll.add(i);			
		}
		long eTime_LL = System.currentTimeMillis();
		long diffLL = eTime_LL-sTime_LL;
		System.out.println("LinkedList took: "+diffLL);
		
	}

}
