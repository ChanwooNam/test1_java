package day11.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test05_Flush {

	public static void main(String[] args) {
		FileReader fis = null; // 한글이 깨지면 리더/라이터로 가야함
		FileWriter fos = null;
		BufferedReader bis = null;
		BufferedWriter bos = null;
		
		
		String filename = "c://lib//DBinfo.txt";
		
		int count = 0;
		int read = 0;
		
		try { // 마우스 올리고 surround try/catch 하면 자동 예외처리
			fis = new FileReader(filename);
			fos = new FileWriter("c://lib//copy.txt",false); // 계속 중첩복사하려면 true
			bis = new BufferedReader(fis);
			bos = new BufferedWriter(fos);
			
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
