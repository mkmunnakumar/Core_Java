package Inheritance;

class Bycicle {
	protected int gear;
	protected int speed;
	public Bycicle(int initialGear, int initialSpeed) {
		gear = initialGear;
		speed = initialSpeed;
	}
	
	public void setGear(int newVal) {
		gear = newVal;
	}
	public void applyBreak(int decreaseSpeed) {
		speed -= decreaseSpeed;
	}
	
	public void applySpeed(int increaseSpeed) {
		speed += increaseSpeed;
	}
	
	
}
