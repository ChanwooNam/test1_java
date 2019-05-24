package day04_fr;

public class Test06_2D_Beyol {

	public static void main(String[] args) {
		int[][] t = {{5,4,3}, {1,2,3,4,5},{9,4}}; // 클래스의 멤버변수
		t[1][2] = 99;
		for(int i = 0 ; i<t.length ; i++) {
			for(int j = 0 ; j<t[i].length ; j++) {
				System.out.print(t[i][j]+",");
			}
			System.out.println();
		}			

	}

}
