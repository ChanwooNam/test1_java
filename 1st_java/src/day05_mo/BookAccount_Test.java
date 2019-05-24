package day05_mo;

public class BookAccount_Test {

	public static void main(String[] args) {
		Book t1 = new Book();
		t1.setTitle("자바의 정석");
		t1.setPrice(200000);
		t1.print();

		Account t2 = new Account();
		t2.setAccno("123456");
		t2.setBala(10000);
		t2.depo(300);
		t2.with(500);
		t2.wire("232323",400);
		t2.print();
	}

}
