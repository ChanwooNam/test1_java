package day03_th;

public class Test08_Loopcase {

	public static void main(String[] args) {
		String msg = "hello java test !!!";
		String msg2 = "";
		StringBuilder sb = new StringBuilder();
		System.out.println(msg);
		for(int i=0 ; i<msg.length() ; i++) {
			// System.out.println(msg.charAt(i)+"=>"+(char)(msg.charAt(i)-32)); // 한글자 대문자
			// System.out.print((char)(msg.charAt(i)-32)); // 전체 대문자 변환
		//msg += (char)(msg.charAt(i)-32); // String 클래스로 직접 사칙연산하지 말것!
		sb.append((char)(msg.charAt(i)-32));
			
		}
		
		msg2 = sb.toString();
		
		System.out.println(msg2);
		
		// str="3"
		// if(str!=null && !str.equals("")) -> 내용이 없거나 블랭크면 허용하지 않는 코드
		
		/*
		String name = "홍길동";
		System.out.println(name);
		System.out.println(name.length()); // 문자열 index는 홍(0) 길(1) 동(2) 3개
		System.out.println(name.charAt(0)+"**"); // 0번 '홍' 만 보이고 나머지는 **
		System.out.println("**"+name.charAt(name.length()-1)); // **하고 마지막글자 공개
		System.out.println(name.substring(0,2)); // 0번포함 2개만
		*/
		
		// charAt 기능은 String 클래스 내 문자값 수치를 이용해 접근하는 기능
		// String 클래스로 직접 사칙연산하지 말것! 성능저하원인 ex) "H"+"E"+"L"+"L"+"O"= ?
			//대신 String 빌더나 버퍼 사용
	}

}
