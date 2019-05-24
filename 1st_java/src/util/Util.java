package util;

public class Util {
	
	public static int[] sort(int[] n) {
		int[] a = n.clone(); // 원본 유지를 위해 복사본(클론) 사용
		for(int i = 0; i < a.length - 1 ; i++) {
			int min = 1;
			for(int j = i+1 ; j<a.length ; j++) {
				if(a[min]>a[j])
					min = j;
			}
			if (i != min) {
				int tmp = a[min];
				a[min] = a[i];
				a[i] = tmp;
			}
		}
		return a;
	}

}
