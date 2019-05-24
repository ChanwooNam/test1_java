package day03_th;

public class Prob3na {

	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<sourceString.length() ; i++) {
			char c = sourceString.charAt(i);
			c = c >= 'a' && c <= 'z'?(char)('a' + ((c-'a')+3)%26):c;
			
			/*c = c >= 'a' && c <= 'w'?(char)(c+3):
				(c >= 'x' && c<='z')?(char)(c-23):c;*/
			sb.append(c);
							
			/*if((sourceString.charAt(i) != ' ') && (sourceString.charAt(i) < 120))
				sb.append((char)(sourceString.charAt(i)+3));
			else if((sourceString.charAt(i) != ' ') && (sourceString.charAt(i) >= 120))
				sb.append((char)(sourceString.charAt(i)-23));
			else sb.append((char)(sourceString.charAt(i)));*/
		}
		encodedString = sb.toString();
		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	
	}

}
