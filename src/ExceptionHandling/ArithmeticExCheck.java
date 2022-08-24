package ExceptionHandling;

public class ArithmeticExCheck {
	public static void main(String[] args) {
		int a=10;
		try {
			int dev = a/0;
			System.out.println(dev);
		}
		catch(ArithmeticException ae) {
			System.out.println("Number cant be devided by zero");
		}
	}

}
