package day04_fr;

import java.util.Arrays;

public class Prob4_Sort {

	public static void main(String[] args) {
		int[] num = new int[6];
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random()*45+1);
						
			// System.out.println(Arrays.toString(num));
			for(int j = 0 ; j<i ; j++) {
				while(true) {
					if(num[i] == num[j])
						num[i] = (int)(Math.random()*45+1);
					else	
						break; // 이상 중복방지
				}
			}
		}
		
		for(int i = 0 ; i<num.length-1 ; i++) {
			int min = i;
			for(int j = i+1 ; j<num.length ; j++) {
				if(num[min] > num[j])
					min = j;
			}
		int temp = num[i];
		num[i] = num[min];
		num[min] = temp;	// 이상 오름차순
		}
		
		System.out.println(Arrays.toString(num));
	}

}
