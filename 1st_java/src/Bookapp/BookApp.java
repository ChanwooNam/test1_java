package Bookapp;

import java.util.Scanner;

import Bookapp.Book;
import Bookapp.BookMgr;

public class BookApp {

	public static void main(String[] args) {
		BookMgr chk = new BookMgr();
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			
			System.out.println("**********************************");
			System.out.println("******** Book Application ********");
			System.out.println("**********************************");
			System.out.println("원하는 메뉴 번호를 입력하세요..");
			System.out.println("1. 입    력");
			System.out.println("2. 수    정");
			System.out.println("3. 삭    제");
			System.out.println("4. 검    색");
			System.out.println("5. 목록보기");
			System.out.println("6. 종    료");
			System.out.println("**********************************");
			String input = keyboard.nextLine();
			if(input == null || input.length()==0) {
				input = "99";
			}
			Book bk = new Book();
			switch (input.charAt(0)) { // 앞의 한글자만 본다
			case '1':
				System.out.println("1. 입    력 서비스");
				System.out.println("제목을 입력하세요"); 
				String t = keyboard.nextLine();
				System.out.println("가격을 입력하세요"); 
				int p = keyboard.nextInt();
				keyboard.nextLine();
				bk.setPrice(p);
				bk.setTitle(t);
				chk.addBook(bk);
				chk.printBookList();
				break;
			case '2':
				System.out.println("2. 수    정 서비스");
				System.out.println("수정하실 책의 제목을 입력하세요");
				String t4 = keyboard.nextLine();
				bk.setTitle(t4);
				chk.delBook(t4);
				chk.printBookList();
				System.out.println("제목을 새로 입력하세요"); 
				String t5 = keyboard.nextLine();
				System.out.println("가격을 입력하세요");
				int p5 = keyboard.nextInt();
				keyboard.nextLine();
				bk.setPrice(p5);
				bk.setTitle(t5);
				chk.addBook(bk);
				chk.printBookList();
				break;
			case '3':
				System.out.println("3. 삭    제 서비스");
				System.out.println("삭제하실 책의 제목을 입력하세요");
				String t2 = keyboard.nextLine();
				bk.setTitle(t2);
				chk.delBook(t2);
				chk.printBookList();
				break;
			case '4':
				System.out.println("4. 검    색 서비스");
				System.out.println("책의 제목을 입력하세요");
				String t3 = keyboard.nextLine();
				bk.setTitle(t3);
				chk.findBook(t3);
				break;
			case '5':
				System.out.println("5. 목록보기 서비스");
				chk.printBookList();
				break;
			case '6':
				System.out.println("Application을 종료합니다.");
				System.exit(0); // 애플리케이션 종료(함수종료 아님)
				keyboard.close();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1에서 6사이의 번호를 입력하세요");
				break;
			}
			
		}
		
	}

}
