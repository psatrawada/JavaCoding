package StringManipulations;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String s = "Hello java world Hello java program !!!";
		String[] sarray = s.split(" ");
		int length = sarray.length;
		System.out.println(Arrays.toString(sarray) +" Array length is: " + length);
		removeDuplicate(sarray);
	}
	public static void removeDuplicate(String[] sa) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String output = "";
		for(String s : sa){
			if(!hm.containsKey(s)){
				hm.put(s,1);
				output += s +" ";
			}
		}
		System.out.println(output);
	}

}
