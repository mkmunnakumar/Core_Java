package MapExam;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("A", 1);
		tm.put("C", 3);
		tm.put("D", 4);
		tm.put("B", 2);
		System.out.println(tm);
		System.out.println(tm.ceilingEntry("B"));
	}

}
