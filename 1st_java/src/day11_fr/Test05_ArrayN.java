package day11_fr;

import java.util.ArrayList;
import java.util.List;

import day09.ex.Book;

public class Test05_ArrayN {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java", 500));
		books.add(new Book("sql", 5200));
		books.add(new Book("jsp", 2500));
		books.add(new Book("html", 1500));
		books.add(new Book("Java", 500));
		books.add(new Book("Java", 500));
		
		books.forEach(i->System.out.println(i.getTitle().charAt(0)+"**"));
		// Book타입이라서 i도 Book타입임
		
		//books.stream().forEach(i->System.out.println(i));
		books.stream().distinct().forEach(i->System.out.println(i));
		// distinct() 는 중복제거. 단 hashcode equals가 잘 되어 있어야함
		
		long count = books.stream().filter(i->i.getPrice()>1000).count();
		System.out.println(count);
		
		long sum = books.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println(sum);
	}

}
