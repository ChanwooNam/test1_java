package day07_th;

public class Test04_Fish {

	public static void main(String[] args) {
		Fish f = new Fish("니모");
		f.print();
		f.breath();
		
		Dog d = new Dog("시바","진돗");
		
		Animal a = d; // 부모클래스에서 자식클래스로 일치 지정 가능
		
		a.breath();
		// a.print(); -> a에는 print 기능이 없어 다운캐스팅 필요
		// 그런데 Dog와 Fish의 캐스팅 결과가 다름 -> 오버라이딩 유도 필요
		// 부모로부터 상속받은 것들 중 자식클래스에 적합하지 않은 메소드는 오버라이딩 필요
		a.print();
	}

}
