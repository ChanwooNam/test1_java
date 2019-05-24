package day09_tu;

public class Test01_Equals {

	public static void main(String[] args) {
		String msg1 = "Hello Java";
		Object msg2 = "Hello Java";
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("msg1 과 msg2 비교 " + msg1.equals(msg2));
		
		Object emp1 = new Employee("홍길동", "기술부");
		Employee emp2 = new Employee("홍길동", "기술부");
		
		System.out.println(emp1); // emp1.toString() <- 이게 찍힘. 오버라이딩 필요
		System.out.println(emp2);
		System.out.println("emp1 과 emp2 비교 " + emp1.equals(emp2));
		
	}

}
