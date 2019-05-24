package day09_tu.Exception;

public class Test02_Throw {

	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			throw new Exception("예외발생"); // 자바에서 강제 예외생성하는 코드
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}

}
