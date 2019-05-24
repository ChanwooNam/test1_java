package day09_tu.Exception;

public class Yeze {

	public static void main(String[] args) {
		System.out.println("가즈아");
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e;
		}catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
