package day04_fr;

import java.util.Arrays;

public class Test02_beyol_Random {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0 ; i<num.length ; i++) {
			num[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(num));
		int[] num2 = num;
		System.out.println(Arrays.toString(num2));
		
		/*num2[0]=77;
		num[0]=11;
		System.out.println(Arrays.toString(num2)); */
		
		int[] num3 = num.clone();
		System.out.println(Arrays.toString(num3));
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
	}

}
