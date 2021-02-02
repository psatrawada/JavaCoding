package Collections;

import java.util.HashMap;

public class HashMapWithUserObjects {
	public static void main(String[] args) {
	
		HashMap<Mark,String> hmap1 = new HashMap<Mark,String>();
		Mark m1 = new Mark(14,"bad");
		Mark m2 = new Mark(14,"bad");
		hmap1.put(m1,"kodi123");
		hmap1.put(m2,"saya123");
		
		HashMap<String,Mark> hmap2 = new HashMap<String,Mark>();
		hmap2.put("kodi",new Mark(11,"bad"));
		hmap2.put("saya",new Mark(13,"bad"));
		hmap2.put("kodi",new Mark(15,"good")); // duplicate keys wont be printed in hashmap and set  but allowed in arraylist
		
				
		System.out.println("Print all Keys in map1:  "+hmap1.get(m1));	
		System.out.println("Print all Keys in map1:  "+hmap1.get(m2));	
		System.out.println("Print all values in map1:  "+hmap1.values());	
	
		System.out.println("Print all Keys in map2 "+hmap2.keySet());	
			
		
		
	}

	
}

class Mark{
	int score;
	String comment;
	public Mark(int s, String c) {
		
	}
	public void setMark(int s) {
		this.score = s;
	}
	public int getMark() {
		return this.score;
	}
	public void setComment(String c) {
		this.comment = c;
	}
	public String getComment() {
		return this.comment;
	}
}

