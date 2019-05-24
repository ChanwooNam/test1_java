package day02_we;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
/*
  변수 num의 값에따라  양수 음수  0을 출력하는  코드를 완성하세요.
   힌트: 삼항연산자.
*/
	
	int num = -3;
	System.out.println("양수 음수  0 판별후 출력");
	// System.out.printf("%d => ", num ); -> printf 권장, %d는 정수
	System.out.println(num > 0 ? "양수": num == 0? "0" : "음수");
	
	/*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	소문자로 변경하는 코드를 완성 합니다.
  	*/
	char ch = 'A';
	char lowerCase = ch >= 'A' && ch <= 'Z' ? ch : (char)(ch + 32); // 표적 데이터만
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);

	/*  년도를 입력받아  윤년인지 판별하여 출력해  보세요 */

	Scanner keyboard = new Scanner(System.in);
	// 데이터가 필요한데, 키보드에서 넘어온 값을 쓰겠음
	System.out.print("연도를입력하세요_");
	int y = keyboard.nextInt();
	// 키보드에서 입력받은 그 값을 y라고 하겠음
	keyboard.hasNextLine();
	System.out.printf("%d ==> ", y);
	System.out.println((y%4 == 0 && y%100 != 0) || y%400 == 0 ? "윤년" : "평년" );

	keyboard.close();
	keyboard = null;
	
	}
}          