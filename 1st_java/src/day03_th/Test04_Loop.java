package day03_th;

public class Test04_Loop {

	public static void main(String[] args) {

		for(int i=10 ; i>5 ; i--) { // 여기부터 변수선언문
			System.out.println(i + "Hello");
		} // 조건이 false가 되면 여기로 이동
		
		int i = 10;
		while(i>5) {
			System.out.println("while loop");
			i--;
		}
		
		do { // 최소한 1번은 실행
			System.out.println("do while");
		} while(i>5) ;
		
		boolean flag = false;
		while(!flag) {
			i--;
			System.out.println("loop ~~~~~~");
			if (i == 0) flag = !flag; // 반복하다가 i가 되는 순간 flag가 아니게 되면서 루프탈출
		}
	}

}
