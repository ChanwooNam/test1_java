package day05_mo;

public class Book {
	private String title;
	private int price;
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void print() {
		System.out.printf("[%s %d] %n",this.title,this.price);
	}

}
