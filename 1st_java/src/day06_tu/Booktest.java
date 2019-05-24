package day06_tu;

import day05_mo.Calc; // import된 자원 중 static한 자원은 메모리에 뜨게 됨

public class Booktest {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("java's jungsuk");
		b1.setPrice(90);
		
		b1.print();
		
		Account a1 = new Account();
		a1.setAccno("333333");
		a1.setMoney(800);
		a1.input(900);
		a1.output(1000);
		a1.print();
		
		Account a2 = new Account();
		a2.setAccno("777777");
		a2.setMoney(0);
		a2.print();
		
		Account.wire(a1, a2, 300);
		a1.print();
		a2.print();
		
		int sum = Calc.add(2,4,6);
		System.out.println(sum);
	}
}
