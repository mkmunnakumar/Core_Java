package hashSetEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<Character> hs = new HashSet<>();
		hs.add('A');
		hs.add('B');
		boolean r1 = hs.add('C');
		System.out.println(r1);
		boolean r2 = hs.add('C');
		System.out.println(r2);
		
		System.out.println(hs);
		
		hs.remove('A');
		System.out.println("After removing A: "+hs);
		
		//iteration
		for(Character ch : hs) {
			System.out.print(ch+" ");
		}
		System.out.println("\nContaining A or not: "+hs.contains('A'));
	}

}
