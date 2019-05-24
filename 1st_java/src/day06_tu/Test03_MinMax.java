package day06_tu;

public class Test03_MinMax {

	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		
		max(a,b); // 명확한 이름은 day06_tu.Test03.max(a,b);
		
		// max(a,b); -> 객체지향언어는 함수라도 그냥 끌어 쓰는것이 불가능
		// System.out.println(new Test03().max(a,b)); // 자원에 접근하려면 주소가 반드시 필요!
	}
	
	public static int max(int a, int b) {
		a=1;
		return a>b ? a:b;
	}
	
	public static int min(int a, int b) {
		return a<b ? a:b;
	}
}
