package day02_we;

public class Test02_Swap {

	public static void main(String[] args) {
		double j = Integer.parseInt("90");
		double y = Double.parseDouble("89.9");
		System.out.printf("j=%5.2f, y=%5.2f %n",j,y);
		double temp; // 스와핑에는 반드시 임시기억공간을 마련해야함
		temp = j;
		j=y;
		y=temp;
		System.out.printf("j=%5.2f, y=%5.2f %n",j,y);
		
	}

}
