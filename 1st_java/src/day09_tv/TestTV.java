package day09_tv;

public class TestTV {

	public static void main(String[] args) {
		TVRule rmc1 = new LTV();
		rmc1.PowerOn();
		
		rmc1 = new STV();
		rmc1.PowerOn();
		
		TVRule rmc2 = new LTV();
		
		tv(rmc2);
		
	}
	
	public static void tv(TVRule tv) {
		tv.PowerOn();
	}

}
