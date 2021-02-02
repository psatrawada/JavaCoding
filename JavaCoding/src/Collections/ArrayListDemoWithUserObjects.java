package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoWithUserObjects {
		public static void main(String[] args) {
			Student s1 = new Student(1001, "King", 'M');
			Student s2 = new Student(1001, "Queen", 'F');
						
			ArrayList al = new ArrayList();
			al.add(s1);
			al.add(s2);		
			// cannot user forloop on just array list objects
			System.out.println("Print created student object and then added to arraylist using Iterator:");
			Iterator i = al.iterator();
			while(i.hasNext()) {
				Student st =(Student) i.next();
				System.out.println(st.name+" sex is: "+st.sex);
			}			
			///To use it in for loop need to create ArrayList with student objects
			System.out.println("Print ArrayList of student objects and printed using ForLoop:");
			ArrayList<Student> als = new ArrayList<Student>();
			als.add(new Student(45,"Kodi",'f'));
			als.add(new Student(11,"saya",'f'));
			for(Student s: als) {
				System.out.println(s.id+" "+s.name+" "+s.sex);
			}	
			System.out.println("Print ArrayList of student objects and printed using Iterator:");
			Iterator j = als.iterator();
			while(j.hasNext()) {
				Student s =(Student) j.next();
				System.out.println(s.name+" id is: "+s.id);
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
	public void setId() {
		this.id=id;		
	}
	public int getId() {
		return(id);		
	}
	public void setName() {
		this.name=name;		
	}
	public String get() {
		return(name);		
	}
	public void setSex() {
		this.sex=sex;		
	}
	public char getSex() {
		return(sex);		
	}
}	
