package day05_mo;

public class Test03_TimeClass {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		t1.setHour(9);
		t1.setSecond(20);
		t1.print();
		
	}

}

class Time{
	
	private int hour; // 이 클래스에서만 적용, 위에 클래스에서도 안됨
	private int second;
	private boolean am;
	
	public boolean isAm() {
		return hour < 12;
	}

	public void setHour(int hour){
		if(hour>=0 && hour<=23)
			this.hour = hour;		
	}
	
	public int getHour(){
		return hour;
	}
		
	public int getSecond() { // source -> generate getters and setters
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void print() {
		System.out.printf("[%2d시 %2d분 %b] %n",this.hour,this.second,am);
	}
}