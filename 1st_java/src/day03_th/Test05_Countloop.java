package day03_th;

public class Test05_Countloop {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 100 ; i++) {
			if(i%2 == 0) { // 짝수만
			sum = sum + i;
			System.out.print(i + "+");
			}
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println("=====================================");
		
		for(int i=0;i<5;i++) { // 5회루프
			for(int j = 11; j<13; j++) { // 2회루프
				System.out.printf("i=%2d , j=%2d %n",i, j); // i j 총 10회 루프
			}
		}
	}

}
