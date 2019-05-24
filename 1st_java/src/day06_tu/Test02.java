package day06_tu;

public class Test02 {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccno("007");
		a1.setMoney(700);
		a1.print();

		Account a2 = new Account("002",-600);
		a2.print();

		Account a3 = new Account();
		a3.print();
		
	}

}
