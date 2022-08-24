package MethodOverloading;

public class Multiply {
	public int multiply(int x,int y) {
		return x*y;
	}
	
	public int multiply(int x,int y,int z) {
		return x*y*z;
	}
	public double multiply(double x, double y) {
		return x * y;
	}
	public static void main(String[] args) {
		Multiply ml = new Multiply();
		System.out.println("int with two args: "+ml.multiply(10, 20));
		System.out.println("int with three args: "+ml.multiply(10, 20, 30));
		System.out.println("double with two args: "+ml.multiply(10.5, 20.2));
		
	}
}
