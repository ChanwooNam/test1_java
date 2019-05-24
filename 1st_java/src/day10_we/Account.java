package day10_we;

import java.io.Serializable;

public class Account extends Object implements Serializable {

	private String accno;
	private int money;
	
	public Account() { // 생성자; Account 클래스의 메모리 로딩 이후, 초기화 작업 수행
//		this("000",10); // this는 생성자 스스로의 또다른 생성자 함수 - 반드시 첫번째 문장으로 할 것!
		
	}
	
	public Account(String accno, int money) throws MoneyException {
		this.setAccno(accno);
	//	try {
		this.setMoney(money);		
	//	}catch (MoneyException e) {
	//		System.out.println(e.getMessage());
	//	}
	}

	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) throws MoneyException { // 예외가 발생할 수 있다는 의미
		if(money < 0)
			throw new MoneyException();
		this.money = money;
		return;
	}
	
	public void input(int money) { // 입금
		if(money >= 0) {
			this.money += money;
		}
	}

	public int output(int money) { // 출금
		if(this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고가 부족합니다");
		return 0;
	}
	public static void wire(Account from, Account to, int money) {
		to.input(from.output(money));
	}
	
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", money=" + money + "]";
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accno == null) {
			if (other.accno != null)
				return false;
		} else if (!accno.equals(other.accno))
			return false;
		if (money != other.money)
			return false;
		return true;
	}

	public void print() { // 통장정보
		System.out.printf("Account[통장번호 : %20s, 잔고 %d 원]%n",accno,money);
	}

}
