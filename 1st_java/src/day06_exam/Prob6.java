package day06_exam;

public class Prob6 {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		
		mgr.addBook(new Book("Java Program",100000));
		mgr.addBook(new Book("JSP Program",30000));
		mgr.addBook(new Book("SQL Fundamentals",1000));
		mgr.addBook(new Book("JDBC Program",500));
		mgr.addBook(new Book("EJB Program",500));

		mgr.printBookList();
		mgr.printTotalPrice();

	}

}
