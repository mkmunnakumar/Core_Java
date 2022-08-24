package Abstract;

public class MainAbs {
	public static void main(String[] args) {
		AbstractExample circle = new Circle();
		circle.draw();
		circle.resize();
		
		AbstractExample rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
	}

}
