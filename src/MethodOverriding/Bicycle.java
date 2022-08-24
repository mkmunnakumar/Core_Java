package MethodOverriding;

public class Bicycle {
	protected int gear;
	protected int speed;
	
	public Bicycle(int startSpeed, int startGear) {
		this.speed = startSpeed;
		this.gear = startGear;
	}
	public void setGear(int newVal) {
		gear = newVal;
	}
	public void applyBreak(int speedDecrease) {
		speed -= speedDecrease;
	}
	public void speedUp(int speedIncrease) {
		speed += speedIncrease;
	}
}
