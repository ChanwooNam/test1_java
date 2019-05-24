package day11_fr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test04_Stream {

	public static void main(String[] args) {
		String[] names = {"hong G","lee KH","KO","javasin"};
		List<String> nn = Arrays.asList(names); // 리스트 구조로 배열 만들기
		nn.forEach(i -> System.out.print(i.toUpperCase()));
		System.out.println();
		
		nn.stream() //stream 클래스는 배열과 콜렉션을 통합한 클래스
		.filter(i->i.length()>5).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		Stream.of(1,2,3,4,5,6,7,8,9,10) // 괄호 안을 기반으로 스트림 만듬
		.filter(i -> i%2 == 0).forEach(i->System.out.print(i+" "));
		
	}

}
