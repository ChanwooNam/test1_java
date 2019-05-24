package day03_th;

public class Test99_dan {

	public static void main(String[] args) {
		System.out.println("***** 구구단 *****");
		
	OUT:for(int i=2;i<10;i++) { // OUT 라벨잼
			for(int j = 2; j<10; j++) {
				// if(j==5) break; // 조건에 맞는 순간 루프탈출
				// if(j==5) continue; // 해당 조건 제외하고 루프 재진입
				if(j==5) break OUT; // j가 5가 되는순간 i도 2로 안넘어가고 루프 종료
				
				System.out.printf("%d*%d =%3d|", j , i , i*j );
			}
			System.out.println();
			
		}
	}
}
