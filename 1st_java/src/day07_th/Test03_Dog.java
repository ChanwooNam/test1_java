package day07_th;

public class Test03_Dog {

	public static void main(String[] args) {
		Dog d = new Dog("시바","진돗");
		d.print();
		
		d.breath();
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind);
		System.out.println("---------------------------------------");
		
		// String a = new Dog("시바","진돗") -> Dog와 String는 부모관계가 아니라 안됨
		Object a = new Dog("시바","진돗");
		if(a instanceof Animal) // 이렇게 바인딩 안하면 런타임 오류 걸릴 위험 있음(객체를 구분하지 않고 받아줘서)
		System.out.println(((Animal)a).kind); // 다운캐스팅(오브젝트는 거의 무조건 다운캐스팅 필요)
		if(a instanceof Dog)
		System.out.println(((Dog)a).kind); // 다운캐스팅(오브젝트는 거의 무조건 다운캐스팅 필요)
		
		// System.out.println(((String)a).toString()); -> 이거 오브젝트라 캐스팅 안댐
		
		if(a instanceof String)
			System.out.println(((String)a).toString());
	}

}
