package day10_Collection;

// ctrl shift o -> 모든 쓸모없는 import 제거
import java.io.Serializable;
// import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test02_Itrator {

	public static void main(String[] args) {
		// List<Book> list = new ArrayList<Book>();
		List<Book> list = new Vector<Book>();
		list.add(new Book("java",900));
		list.add(new Book("sql",1900));
		list.add(new Book("db",9900));
		list.add(new Book("spring",4900));
		
		/*Object[] o = new Object[list.size()];
		o = list.toArray();
		
		String[] s = new String[list.size()];
		s = list.toArray(s);
		*/
				
		/*System.out.println(list);
		list.remove(new Book("db",9900));
		
		Collections.sort(list);
		System.out.println(list);
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).getTitle().charAt(0)+"**");
		}*/
			
		
		/*System.out.println("배열");
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		*/
		
		Iterator<Book> it = list.iterator();
			while (it.hasNext()) {
				Book book = (Book) it.next();
				// System.out.println(book);
				if(book.getTitle().equalsIgnoreCase("spring")) {
					it.remove();
				}
			}
			System.out.println(list);
				
	}

}
class Book implements Serializable, Comparable<Book> { // 북은 북끼리 비교 
	private String title;
	private int price;
		
	public Book() {	}

	public Book(String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title.length()>0) {
		this.title = title;
		}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>0) {
		this.price = price;
		}
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	/*@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if(obj != null && obj instanceof Book) {
			Book temp = (Book)obj;
			if(title.equals(temp.title) && price == temp.price) {
				flag = true;
			}
		}
		return flag;
	}*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		// return price-o.price;  // 책의 가격대로 sort한다는 의미
		// return title.compareTo(o.title);  // 제목 오름차순
		return o.title.compareTo(title);  // 제목 내림차순
	}
}