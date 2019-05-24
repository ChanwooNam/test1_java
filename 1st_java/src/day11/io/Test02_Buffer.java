package day11.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_Buffer {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String filename = "c://lib//Ben.mp3";
		
		int count = 0;
		int read = 0;
		System.out.println(read);
		try { // 마우스 올리고 surround try/catch 하면 자동 예외처리
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("c://lib//copy.mp3");
			
			System.out.println(" *** 파일 복사 시작 *** ");
			byte[] buffer = new byte[fis.available()]; // available는 파일 사이즈를 의미, 이 코드는 파일 사이즈를 한번에 저장하는 코드
			while((read = fis.read(buffer)) != -1){ // 1b씩 읽고 복사해서 기록 
				fos.write(buffer);
				count++;
			} // 버퍼를 쓰면 속도가 비교가 안되게 빨라짐(전체 사이즈를 한번에 복사)
			

			System.out.println("IO 횟수 : "+count);
			System.out.println(" *** 파일 복사 완료 *** ");
			
		} catch (FileNotFoundException e) {
			System.out.println("복사할 파일 없음");
		}catch (Exception e){ // 기타예외처리
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main end");
	}

}
