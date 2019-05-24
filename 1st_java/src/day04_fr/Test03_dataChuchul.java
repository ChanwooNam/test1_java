package day04_fr;

import java.util.Arrays;

public class Test03_dataChuchul {

	public static void main(String[] args) {
		String msg = "hello java programming ~~~~~~~~";
		
		char[] c;
		// c = new char[10];
		c = new char[msg.length()];
			
		for(int i = 0 ; i<c.length ; i++) {
			c[i] = msg.charAt(i);
		}
		System.out.println(Arrays.toString(c));
		
		System.out.println("-------------------------------");
		for(char data:c) { // char타입의 c에서 무작위 데이터 추출
			System.out.print(data);
		}
		System.out.println("-------------------------------");
		
		int[] n1 = {1,2,3};
		int[] n2 = new int[n1.length*2];
		System.out.println(Arrays.toString(n1)); // 1 2 3
		System.out.println(Arrays.toString(n2)); // 0 0 0 0 0 0
		System.arraycopy(n1,0,n2,1,n1.length); // n2의 2번째(1)에 n1의 1번째(0)부터 전부복사하는 api
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		
		char[] s = "SQL".toCharArray(); // String을 바로 char로 컨버트하는 api
		System.out.println(Arrays.toString(s));
		
		String[] s3 = {"java", "sql", "cent os", "R", msg};
		
		for(String data :s3) {
			if(data.length()>5) {
				System.out.println(data);
			}
		}
	}

}
