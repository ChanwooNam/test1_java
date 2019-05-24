package day08_fr;


public class Test04 {

	public static void main(String[] args) {
		// Object c = new Circle();
		// Drawable c = new Circle();
		// Movable c = new Circle();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		Drawable d = c; // 모든 객체의 데이터타입은 부모가 될 수 있다
		d.draw();
		
		
		Movable m = r;
		m.move();
		
		MovableAndDrawable[] md = {c,r};
		md[1].draw();
		md[0].move();
		
	}

}
