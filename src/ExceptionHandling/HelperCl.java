package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class HelperCl {
	public void write(){
	try {
		List al = new ArrayList();
		al.add(10);
		System.out.println("Entering in try catch block");
		al.get(1);
		System.out.println("Access the first elements: "+al);
	}
	catch(IndexOutOfBoundsException ie) {
		System.err.println("IndexOutOfBoundException occured at "+ie.getMessage());
	}
	finally {
		System.out.println("Finally Always execute");
	}
  }
}
