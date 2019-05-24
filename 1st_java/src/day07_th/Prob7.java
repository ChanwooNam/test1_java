package day07_th;

public class Prob7 {

	public static void main(String[] args) {
		Person s = new Student("홍길동",20,200201);
		Person t = new Teacher("이순신",30,"JAVA");
		Employee e = new Employee("유관순",40,"교무과");
		
		Person p = s;
		p.print();
		p = t;
		p.print();
		p = e;
		p.print();
		/*
		Person p1 = s;
		Person p2 = t;
		Person p3 = e;
		
		p1.print();
		p2.print();
		p3.print();*/
		
		Prob7.personPrint(e);
	}
	public static void personPrint(Person e) {
		e.print();
	}
}
