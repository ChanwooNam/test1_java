package day03_th;

import java.util.Scanner;

public class Test03_grade {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("시작하려면 yes를 입력하세요");
		
		String msg = input.nextLine();
		
		if(!(msg != null && msg.equalsIgnoreCase("yes"))) { // 메시지가 널이 아니면서 메시지가 예스일때만
			System.out.println("Application stop");
			if(input != null) {
				input.close(); // 인풋이 널이 아닐때만 닫기
				input = null;
			}
			return;
		}
		System.out.println("성적처리 Application start");
		System.out.println("성적을 입력하세요");
		System.out.println("국어 영어 수학 \n 입력예) 90 90 90 엔터");
		
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		int k3 = input.nextInt();
		input.nextLine(); // 처음에는 별 필요 없지만, 반복처리가 많아지면 에러방지를 위해 반드시 필요
				
		double m = 0.0;
		System.out.printf("국어:%d점 , 영어:%d점 , 수학%d점, ", k1, k2, k3);
		System.out.printf("평균:%.2f점 %n", m=(k1+k2+k3)/3.);
		
		char grade = (m>=90 && m<=100)? 'A':
					 (m>=80 && m<90)? 'B':
					 (m>=70 && m<80)? 'C':
					 (m>=60 && m<70)? 'D':'F';
		/*
		if(m >= 90 && m <= 100) grade = 'A';
		else if(m >= 80 && m < 90) grade = 'B';
		else if(m >= 70 && m < 80) grade = 'C';
		else if(m >= 60 && m < 70) grade = 'D';
		else grade = 'F';
		*/
		
		System.out.printf("성적처리결과 [%c] 등급 %n", grade);
		
		if(input != null) {
			input.close(); // 인풋이 널이 아닐때만 닫기
			input = null;
			
		}
		System.out.println("Application stop");

	}

}
