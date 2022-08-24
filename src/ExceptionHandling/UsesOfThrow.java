package ExceptionHandling;

public class UsesOfThrow {
	public static void main(String[] args) {
		try {
			try {
				try {
					int []arr = {1,2,3,4};
					System.out.println(arr[10]);
				}catch(ArrayIndexOutOfBoundsException ae){
					System.out.println("Index out of bond exception block 3");
					throw ae;
				}
			}catch(ArrayIndexOutOfBoundsException ae){
				System.out.println("Index out of bond exception block 2");
				throw ae;
			}
		}catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Index out of bond exception block 1");
		}
		catch(Exception e5) {
			System.out.println("General exception");
		}
	}

}
