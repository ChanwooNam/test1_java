package day11.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_FisFos {
// 모든 복사 이후에는 파일 크기부터 확인하시라
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String filename = "c://lib//Ben.mp3";
		
		int count = 0;
		int read = 0;
		
		try { // 마우스 올리고 surround try/catch 하면 자동 예외처리
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("c://lib//copy.mp3");

			System.out.println(" *** 파일 복사 시작 *** ");
			while((read = fis.read()) != -1){ // 1b씩 읽고 복사해서 기록 
				fos.write(read);
				count++;
			}
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
