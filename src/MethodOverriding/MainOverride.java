package MethodOverriding;

public class MainOverride {
	public static void main(String[] args) {
		Bicycle bc = new Bicycle(10, 2);
		System.out.println("Innitial Bicycle gear is: "+bc.gear);
		System.out.println("Innitial Bicycle speed is: "+bc.speed);
		bc.applyBreak(2);
		System.out.println("After apply break Bicycle speed is: "+bc.speed);

		Bicycle mb = new MountainBike(10, 20, 1);
		System.out.println("Innitial speed of MountainBike is: "+mb.speed);
//		mb.applyBreak(5);
//		System.out.println("After apply break MountainBike speed is: "+mb.speed);
		mb.speedUp(5);
		System.out.println("After apply speed MountainBike speed is: "+mb.speed);
	}
}
