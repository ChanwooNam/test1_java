package day05_mo;

public class Account {
	private String accno; // 계좌번호
	private int bala; // 잔고
	private int depo; // 입금
	private int with; // 출금
	private int wire; // 이체
	
	public String getAccno() {
		return accno;
	}
	
	public void setAccno(String accno) {
		this.accno = accno;
	}

	public int getBala() {
		return bala;
	}
	public void setBala(int bala) {
		this.bala = bala;
	}
	
	public void depo(int ...a) {
		int sum = 0;
		for(int data:a) {
			sum += data;
		}
		bala += sum;
		System.out.printf("%d원이 입금되었습니다. %n", sum);
		System.out.printf("현재 잔액:%d원 %n", bala);
	}	
	
	public void with(int ...b) {
		int sum2 = 0;
		for(int data:b) {
			sum2 += data;
		}
		bala -= sum2;
		System.out.printf("%d원이 출금되었습니다. %n", sum2);
		System.out.printf("현재 잔액:%d원 %n", bala);
	}

	public void wire(String accno, int ...w) {
		int sum3 = 0;
		for(int data:w) {
			sum3 -= data;
		}
		bala -= sum3;
		System.out.printf("s%계좌로 %d원이 이체되었습니다. %n", accno, sum3);
		System.out.printf("현재 잔액:%d원 %n", bala);
	}

	public void print() {
		System.out.printf("[계좌번호 %d, 잔고 %d원, 입금 %d원, 출금 %d원, 계좌이체 %d원] %n"
				,accno,bala,depo,with,wire);
	}

}
