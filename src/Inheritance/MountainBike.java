package Inheritance;

class MountainBike extends Bycicle{
	public int seatHight;

	public MountainBike(int startSpeed, int startingHigth, int startGear ) {
		super(startGear, startSpeed);
		seatHight = startingHigth;
	}
	public void setSeatHight(int increaseHight) {
		seatHight += increaseHight;
	}

}
