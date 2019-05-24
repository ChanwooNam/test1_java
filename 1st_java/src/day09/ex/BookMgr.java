package day09.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookMgr {
	int i = 0;
	private Book[] booklist; 
	
	
	public BookMgr() {
		booklist = new Book[10];
		Scanner sc = null;
		try {sc = new Scanner(new File("c://lib/bookdata.txt")); 
			 while(sc.hasNextLine()) { // 파일이 비어있는지
				String data = sc.nextLine(); // 줄단위로 읽으면 String타입
				String[] bookdata = data.split("/"); 
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				
				Book book = new Book(title,price);
				addBook(book);
			}
		}catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일을 준비해주세요");
			
		}catch (Exception e) {
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		}finally {
			if(sc != null) sc.close();
		}
	}
	
	public void addBook(Book book) {
		
		if(i == booklist.length) {
			Book[] temp = new Book[booklist.length *2];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
			temp = null;
		}
		for(int j = 0; j<i ; j++)	{
			if(book.equals(booklist[j]))
			return;
		}	
		booklist[i]=book;
		i++;
	}
	
	public void printBookList() {
		System.out.println("======== 책 목록 ========");
		for(int j = 0 ; j<i ; j++) {
		System.out.println(booklist[j].toString());
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
