package day09_tu.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04_TryWhileCatch {

	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc = null;
		
		try {
			 sc = new Scanner(new File("c://lib/bookdata.txt"));
			 while(sc.hasNextLine()) {
				 String data = sc.nextLine();
				 String[] bookdata = data.split("/");
				 String title = bookdata[0];
				 int price = Integer.parseInt(bookdata[1]);
				 System.out.println("Read : "+data);
				 System.out.println(title+price);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("bookdata.txt 파일을 준비해주세요");
		}catch (Exception e) {
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		}finally {
			if(sc != null) sc.close(); // 널포인트익셉션 방지하며 자원반납
		}
		
		System.out.println("end");
	}

}
