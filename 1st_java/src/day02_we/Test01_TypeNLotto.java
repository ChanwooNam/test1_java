package day02_we;

import java.util.Date;

public class Test01_TypeNLotto {

	public static void main(String[] args) {
	
		int i = 5;
		char q = 'a';
		double a = 'A';
		
		System.out.println(i);
		System.out.println(q);
		System.out.println(a);

		int hi;
		hi = 1;
		
		System.out.println(hi);
				
		Date d = new Date();  // 8개 기본형이 아닌, 주소만 저장하는 d
		
		// System.out.println(d.toLocaleString());
		// 취소선은 deprecated된 api -> 더 이상 이렇게 쓰지 않아서...
		Date d2 = d;  // 양쪽 타입이 일치해야함. Date d2 = i; 면 에러
		d = null;
		
		System.out.println(d);
		System.out.println(d2);

		//String s1 = new String("hello");
		//String s2 = ("hello");
		// String는 문자열 호출, 모든 데이터타입 커버가능
		// 그러나 메모리에는 수정불가한 객체로 들어가서 부하가 커지므로 남발금지
		
		//String ss = new Date().toLocaleString();
		// new는 템포러리 객체, 메모리에는 뜨지만 잠깐 쓰고 버릴 것
		
		//System.out.println(ss);
		
		double pi = Math.PI;
		// int r = Math.random();  양쪽의 양식이 달라서 에러
		double r = Math.random();
		int r1 = (int)(Math.random()*45+1); // 로또숫자추출
		
		System.out.println(pi + "," + r + "," + r1);
		
		System.out.printf("pi=%f, r=%f, r1=%d %n" ,pi,r,r1);
		System.out.printf("pi=%.4f, r=%.2f, r1=%d %n" ,pi,r,r1);
		
	}

}
