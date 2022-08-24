package Inheritance;

public class Main {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println("Gear is: "+mountainBike.gear);
		System.out.println("Seat Hight is: "+mountainBike.seatHight);
		System.out.println("Bike Speed is: "+mountainBike.speed);
		mountainBike.applyBreak(1);
		System.out.println("After apply Break: "+mountainBike.speed);
		mountainBike.applySpeed(2);
		System.out.println("After apply speed: "+mountainBike.speed);
	}
}
