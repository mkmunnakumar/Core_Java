package Abstract;

public class Circle extends AbstractExample{

	@Override
	void draw() {
		System.out.println("Drow a circle");
		
	}

	@Override
	void resize() {
		System.out.println("Resize a circle");
	}

}
