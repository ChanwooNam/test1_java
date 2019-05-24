package day05_mo;

public class Calc {
	
	public static double add(double a, double b) {
		return a+b;
	} // 메소드 오버로딩 - 타입만 바꾸어도 가능
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int ... a) {
		int sum = 0;
		for(int data:a) {
			sum += data;
		}
		/*for(int i=0; i<a.length; i++) {
			sum += a[i];
		}*/
		return sum;
	} // 가변인자 처리, 가변인자는 int의 배열 개념
	public int substract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
}
