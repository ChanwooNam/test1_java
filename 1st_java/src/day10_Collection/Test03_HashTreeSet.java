package day10_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test03_HashTreeSet {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>(); // 중복제거
		set1.add("hello1");
		set1.add("hello2");
		set1.add("hello3");
		set1.add("hello1");
		System.out.println(set1);
		
		
		// Set<Book> set1 = new HashSet<Book>();
		Set<Book> set = new TreeSet<Book>(); // 중복제거 + sorting
		set.add(new Book("java",900));
		set.add(new Book("sql",1900));
		set.add(new Book("db",9900));
		set.add(new Book("spring",4900));
		set.add(new Book("java",900));
		set.add(new Book("sql",1900));
		set.add(new Book("db",9900));
		set.add(new Book("spring",4900));
		
		System.out.println(set.size());
		System.out.println(set);
		
		Iterator<Book> it = set.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			// System.out.println(book);
			if(book.getTitle().equalsIgnoreCase("spring")) {
				it.remove();
			}
		}
		System.out.println(set);
		
		/*for(Book data:set1) {
			System.out.println(set1);
		}*/
		
		Book b = new Book("Java", 900);
		Book b2 = new Book("Java", 900);
		
		System.out.println(b.equals(b2));
	}

}
