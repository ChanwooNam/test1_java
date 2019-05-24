package day11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04_BisBos {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		String filename = "c://lib//Ben.mp3";
		
		int count = 0;
		int read = 0;
		
		try { // 마우스 올리고 surround try/catch 하면 자동 예외처리
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("c://lib//copy.mp3",false); // 계속 중첩복사하려면 true
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			// byte[] buffer = new byte[1024*1024]; // 1mb단위로 버퍼
			
			System.out.println(" *** 파일 복사 시작 *** ");
			while((read = bis.read()) != -1){ //  
				bos.write(read);
				count++;
			}
			
			bos.flush(); // 마지막 버퍼가 비워지지 않을때를 대비하여 비우는 명령
			
			System.out.println("IO 횟수 : "+count);
			System.out.println(" *** 파일 복사 완료 *** ");
			
		} catch (FileNotFoundException e) {
			System.out.println("복사할 파일 없음");
		}catch (Exception e){ // 기타예외처리
			System.out.println(e.getMessage());
		}finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main end");
	}

}
