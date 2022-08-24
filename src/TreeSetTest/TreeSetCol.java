package TreeSetTest;

import java.util.TreeSet;

public class TreeSetCol {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("B");
		ts.add("C");
		ts.add("A");
		ts.add("C");
		System.out.println(ts);
	}

}
