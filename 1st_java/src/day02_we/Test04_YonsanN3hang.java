package day02_we;

import java.util.Scanner;

public class Test04_YonsanN3hang {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(15%3); // %는 나머지 구하는 연산자
		System.out.println(num++); // ++은 +1인데, 뒤로 갈 경우 이것이 이미 계산된 상태
		
		Scanner keyboard = null;
		String msg = "Hello";
		String msg2 = "Hello";
		
		boolean flag = num < 15 && msg.length() > 0;
		System.out.println(flag);
		System.out.println(num == msg.length()); // 15 == 22 -> false
		System.out.println(msg.equals(msg2));
		System.out.println(msg == msg2); 
		
		System.out.println("------------------------------------");
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// 기본형 비교시에는 ==, 그러나 스트링은 기본형이 아니므로 equals로 비교하는 것을 권장
		// 모든 주소는 equals를 제공
		System.out.println(4 << 2); // 16 
		System.out.println(4 >> 1); // 2
		System.out.println(4 & 1); // 0  --  이상 비트연산(공부해)
		
	    byte a = 10;
	    byte b = 20;
	    // byte c = a + b; byte + byte 는 int연산이 되어 에러가 뜸
	    byte c = (byte)(a + b); 
		
	    System.out.println(c);
		
		keyboard = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int jumsu = keyboard.nextInt();
		keyboard.nextLine();
		keyboard.close();
		keyboard = null;
		
		System.out.println("유효성 검증");
		if(!(jumsu >= 0 && jumsu <= 100)) {
			System.out.println("FAIL");
			return;
		}
		System.out.println(jumsu >= 80 ? "PASS":"NO PASS"); // 삼항연산자
		
		System.out.println("END");
		
	}

}
