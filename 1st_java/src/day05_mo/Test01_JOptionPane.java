package day05_mo;

import javax.swing.JOptionPane;

public class Test01_JOptionPane {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("이름을 입력해 주세요!"); // 입력창 소환
		System.out.println(data);
		
		String jumsu = 
		JOptionPane.showInputDialog("국/영/수 점수를 입력해 주세요!");
		System.out.println(jumsu);
		double sum = 0;
		for(int i=0 ; i<jumsu.split("/").length ; i++) {
			sum += Integer.parseInt(jumsu.split("/")[i]);
		}
		System.out.println(sum/jumsu.split("/").length);
	}

}
