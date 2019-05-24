package day06_exam;

public class Book {
	private String title;
	private int price;
	
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
	public void print() {
		System.out.printf("Book[제목 : %s  가격 : %d]%n",title,price);
	}
	
}
