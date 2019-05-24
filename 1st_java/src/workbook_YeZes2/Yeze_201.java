package workbook_YeZes2;

public class Yeze_201 {

	public static void main(String[] args) {
		int i = 15;
		if(i>10 && i<20) {
			System.out.println("true");
		}
		char ch1 = ' ';
		if((char)ch1 != ' ' || (char)ch1 != '	') {
			System.out.println("true");
		}
		char ch2 = 'x';
		if((char)ch2 == 'x' || (char)ch2 == 'X') {
			System.out.println("true");
		}
		char ch3 = '9';
		if(ch3 < 58 && ch3 >= 48) {
			System.out.println("true");
		}
		char ch4 = 'a';
		if(ch4 > 1 && ch4 <= 100) {
			System.out.println("true");
		}
		int year = 400;
		if((year%100 != 0 && year%4==0) || year%400 == 0) {
			System.out.println("true");
		}
		boolean powerOn = false;
		if(!powerOn) {
			System.out.println("true");
		}
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println("true");
		}
	}

}
