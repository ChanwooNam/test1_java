package day08_fr;
// 인터페이스에는 추상메소드만 들어갈 수 있음
public interface Movable { // 약속, 규칙 -> abstract class보다 강력
	public abstract void move();
	
}

interface Drawable{
	void draw(); // 앞에 public abstract가 생략되어 있음
}

interface MovableAndDrawable extends Movable,Drawable{
	// 자바는 single inheritance 이지만 인터페이스에서만 multi inheritance가 가능	
}

class Circle extends Object implements MovableAndDrawable{ // 인터페이스 상속은 implements
	
	@Override
	public void move() {
		System.out.println("Circle Move ");
	}
	
	@Override
	public void draw() {
		System.out.println("Circle draw ");
	}
	
}

class Rectangle extends Object implements MovableAndDrawable{ // 인터페이스 상속은 implements
	
	@Override
	public void move() {
		System.out.println("Rectangle Move ");
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle draw ");
	}
	
}
