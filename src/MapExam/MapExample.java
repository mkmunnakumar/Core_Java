package MapExam;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		String str = "munna";
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			else
				hm.put(str.charAt(i), 1);
		}
		
		System.out.println(hm);
	}

}
