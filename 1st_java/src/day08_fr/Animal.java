package day08_fr;

public abstract class Animal extends Object{ // 앱스트랙트는 상속만을 위해 존재하는 클래스
	String kind = "동물의 종류"; // 여기서 소스 -> 컨스트럭트

	
	public Animal() { // 기본생성자
		super();
	}
	
	public Animal(String kind) {
		this.kind = kind;
	}

	public abstract void breath(); // 상속받음
	/*public void breath(){
		System.out.println("폐호흡");
	}*/
	
	public void print() {} // Test04의 오버라이딩 유도
}

class Dog extends Animal{ // 상위인 Animal에서 기본생성자 필요
	String kind;
	String name;
	
	public Dog() {
		super("강아지과");
		// super.kind = "강아지";
	}

	public Dog(String kind, String name) {
		super("강아지과 ");
		this.kind = kind;
		this.name = name;
	}
	
	@Override
	public void breath() { // 이게 앱스트랙트로 상속됨
		System.out.println("폐호흡");
	}
	
	public void print() {
		System.out.printf("동물[%s(%s),%s] %n",super.kind,this.kind,name);
	}

	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}
	
}

class Fish extends Animal{
	String name;
	
	public Fish() {}
	public Fish(String name) {
		// super(); // 이거 생략되어있음
		// super.kind = "생선";
		super("생선"); // 위의 두개 합치면 이거
		this.name = name;
	}

	public void print() {
		System.out.printf("동물[%s,%s] %n",super.kind,name); // 여기선 this나 super나...
	}
	
	@Override // 오버라이드가 제대로 되었는지 확인하고 오류를 알려주는 기능
	public void breath(){ // 오버라이딩 - 부모클래스의 속성 대신 이걸로 덮어씀
		System.out.println("아가미호흡");
	}
	@Override
	public String toString() {
		return "Fish [name=" + name + "]";
	}
	
}
