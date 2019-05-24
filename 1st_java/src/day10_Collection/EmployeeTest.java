package day10_Collection;

public class EmployeeTest {

	public static void main(String[] args) {
		/*Employee<String> emp = new Employee<String>("홍길동","2019001");
		System.out.println(emp.number.substring(0,4)); // 뒤의 숫자도 String타입
		
		Employee<Integer> emp1 = new Employee<Integer>("홍길동",1);
		System.out.println(emp1); // 뒤의 숫자는 Int타입
		
		Employee emp2 = new Employee("김길동","2019002");
		System.out.println(emp2.number); // Object 타입
		*/
		Employee<String, String> emp1 = new Employee<String, String>("홍길동", "2019-001");
		System.out.println(emp1);
		Employee emp2 = new Employee("김길동",8);
		System.out.println(emp2);
	}

}
