package Abstract;

public abstract class AbstractExample {
	int x,y;
	//its called every time when new object is created
	public AbstractExample() {
		System.out.println("Abstract class called");
	}
	void moveTo(int deltaX, int deltaY) {
		System.out.println("Move to x : "+x+" and y : "+y);
	}
	abstract void draw();
	abstract void resize();

}
