package Bookapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMgr {
	private Map<String, Integer> booklist = new HashMap<String, Integer>();
	
	Scanner sc = null;
	
	public BookMgr() {
		try {
			sc = new Scanner(new File("c://lib/bookdata.txt")); 
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] bookdata = data.split("/"); 
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				booklist.put(title,price);
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
	public BookMgr(HashMap<String, Integer> booklist) {
		super();
		this.booklist = booklist;
	}
	
	public void addBook(Book book) {
		if (booklist.containsKey(book.getTitle())) {
			System.out.println("이미 해당 제목의 책이 존재합니다");
		}else booklist.put(book.getTitle(),book.getPrice());
	}

	
	public void printBookList() {
		System.out.println("======== 책 목록 ========");
		booklist.forEach((t,u)->System.out.println(t+" "+u));
	}
		
	public void delBook(String d) {
		if(!booklist.containsKey(d)) {
			System.out.println("해당 제목의 책이 없습니다");
		}else booklist.remove(d);
	}
	public void findBook(String t3) {
		if (booklist.containsKey(t3))
			System.out.printf("%s의 가격은 %d입니다%n",t3,booklist.get(t3));
		else
			System.out.println("등록되지 않은 책입니다.");
	}
}
