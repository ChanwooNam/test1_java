package day06_exam;

public class BookMgr {
	int i = 0;
	private Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	public BookMgr() {
		booklist = new Book[3];
	}
	public void addBook(Book book) {
		if(i == booklist.length) {
			Book[] temp = new Book[booklist.length *2];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
		}
		booklist[i] = book;
		i++;
	}
	
	public void printBookList() {
		System.out.println("======== 책 목록 ========");
		for(int j = 0 ; j<i ; j++) {
		System.out.println(booklist[j].getTitle());
		}
	}
	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int sum = 0;
		for(int j = 0 ; j<i ; j++) {
			sum += booklist[j].getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + sum);
	}
}
