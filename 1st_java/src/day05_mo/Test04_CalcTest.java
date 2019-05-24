package day05_mo;

public class Test04_CalcTest {

	public static void main(String[] args) {

		/*Calc c1 = new Calc();
		Calc c2 = new Calc();
		Calc c3 = new Calc();
		System.out.println(c1.add(99, 11));
		System.out.println(c2.add(99, 11));
		System.out.println(c3.add(99, 11));*/
		
		System.out.println(Calc.add(99, 11)); // static한 자원의 경우
		System.out.println(Calc.add(99.9, 11.1)); // double 타입 메소드 오버로딩
		System.out.println(Calc.add(1,2,3,4,5,6,7,8,9,10)); // 가변인자는 반드시 파라미터 맨 뒤에 위치
		System.out.println(Calc.add(1));
	}

}
