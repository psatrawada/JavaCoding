package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoWithUserObjects {
		public static void main(String[] args) {
			Student s1 = new Student(1001, "King", 'M');
			Student s2 = new Student(1001, "Queen", 'F');
			Student s3 = new Student(1001, "Minister", 'F');
			Student s4 = new Student(1001, "Soldier", 'M');		
			
			ArrayList al = new ArrayList();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al.add(s4);
			
			Iterator i = al.iterator();
			while(i.hasNext()) {
				Student st =(Student) i.next();
				System.out.println(st.id+" "+st.name+" "+st.sex);
			}
		}
}

class Student{
	int id;
	String name;
	char sex;	
	
	Student(int i, String n, char s){
		this.id =i;
		this.name =n;
		this.sex = s;
	}
}	
