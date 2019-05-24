package day04_fr;

import java.util.Arrays;

public class Test01_Beyol {

	public static void main(String[] args) {
		// int count; // 변수 선언
		
		double m = 0.0;
		int[] jumsu; // 배열 선언
		jumsu = new int[5]; // 배열 생성
		// System.out.println(jumsu[5]); <- 접근할 수 없는 인덱스로 에러
		
		jumsu[0] = 32;
		jumsu[1] = 56;
		jumsu[2] = 45;
		jumsu[3] = 71;
		jumsu[4] = 79;
		
		for(int i = 0; i<jumsu.length; i++) {
			System.out.println(jumsu[i]+",");
		}
		
		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu)); // 배열 출력 Api

		int[] num = {88, 55, 77, 99, 77, 33};
		System.out.println(Arrays.toString(num));
		
		String[] names;
		names = new String[5];
		names[0] = "홍길동";
		names[1] = "김길동";
		names[2] = "이길동";
		names[3] = "";
		System.out.println(Arrays.toString(names)); // String에서 배열상 빈 값은 null
		System.out.println("==================================================");
		
		int sum = 0;
		for(int i = 0; i<jumsu.length ; i++) {
			sum += jumsu[i];
		}
		m = sum/jumsu.length;
		
		for(int i = 0 ; i < jumsu.length ; i++) {
			if(names[i] != null && names[i].length()!=0)
			System.out.printf("%s ** : %3d %n", names[i].charAt(0),jumsu[i]);
			else
			System.out.printf(" 이름없음 : %3d %n", jumsu[i]);
		}
		System.out.printf("학생평균 %.2f %n", m);
	}

}
