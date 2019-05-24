package day09_tu.Exception;

import javax.swing.JOptionPane;
// 예외처리란 각 예외상황에 맞는 적절한 대응을 하는 것이다!
public class Test01_TryCatch {

	public static void main(String[] args) {
		System.out.println("start");
		String num = JOptionPane.showInputDialog("숫자를 입력하세요..");
		try {
			System.out.println(1);
			// System.out.println(4/0); // 예외발생 -> catch로 넘어감
			System.out.println(4./Integer.parseInt(num)); // String을 숫자로 변환
			System.out.println(2);
		}catch (ArithmeticException e) { // 산술적인 오류일경우
			System.out.println(e.getMessage());
			System.out.println("0으로 나누지마 수알못아");
		}catch (NumberFormatException e) { // 숫자가 아닐경우
			System.out.println(e.getMessage());
			System.out.println("문자 쓰지마 한글못읽냐?");
		}catch (Exception e) { // 모든예외처리
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally { // 예외가 발생해도 자원반납은 해야하므로 반드시 여기에서 반납할것
			System.out.println(9);
		}
		System.out.println("end");
	}

}
