package day11_fr;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test02_Properties {

	public static void main(String[] args) {
		Properties p = new Properties(); // key값과 Value값으로 자원관리하는 객체 Properties
		try {
			p.load(new FileInputStream("dbinfo.txt")); // 이 파일에서 자원 가져옴
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pw = p.getProperty("pw");
			
			System.out.println(url);
			System.out.println(user+"/"+pw);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
