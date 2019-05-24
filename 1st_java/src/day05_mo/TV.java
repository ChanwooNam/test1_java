package day05_mo;

public class TV {
	// 데이터(속성) + 기능(method)
	String color;
	int size;
	boolean power;
	int channel;
	
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	public void power() {
		this.power = !this.power;
	}
	public void print() {
		System.out.printf("TV[전원상태 %b, 현재채널 : %d,%s] %n",
				this.power,this.channel,this.color);
	}
	// 이상 TV라는 클래스를 정의
	
}
