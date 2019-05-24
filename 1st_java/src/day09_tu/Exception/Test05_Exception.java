package day09_tu.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05_Exception {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(new File("c://lib/bookdata.txt"))) {
			 while(sc.hasNextLine()) {
				 String data = sc.nextLine();
				 // String[] bookdata = data.split("/");
				 // String title = bookdata[0];
				 // int price = Integer.parseInt(bookdata[1]);
				 System.out.println("Read : "+data);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("bookdata.txt 파일을 준비해주세요");
		}catch (Exception e) {
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		// }finally { 
			// if(sc != null) sc.close(); -> 이번에는 앞에서 try가 자원반납까지 다 해줌
		}
		
		System.out.println("end");
	}

}
