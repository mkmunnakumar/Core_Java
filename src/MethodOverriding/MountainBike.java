package MethodOverriding;

public class MountainBike extends Bicycle{
	public int seatHight;
	public MountainBike(int startSpeed, int startGear, int startSeatHight) {
		super(startSpeed, startGear);
		this.seatHight = startSeatHight;
	}
	@Override
	public void setGear(int newVal) {
		gear = newVal+2;
	}
	@Override
	public void applyBreak(int decreaseSpeed) {
		speed = speed - decreaseSpeed - 2;
	}
	@Override
	public void speedUp(int increaseSpeed) {
		speed = speed + increaseSpeed + 10;
	}
	

}
