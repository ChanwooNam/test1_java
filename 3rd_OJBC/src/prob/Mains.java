package prob;

import javax.swing.JOptionPane;

public class Mains {

	public static void main(String[] args) {
		EmpManager em = new EmpManager();
		
		String a = JOptionPane.showInputDialog("job title please");
		String b = JOptionPane.showInputDialog("job title please22");
		String[] jobs = {a,b};
		em.printEmployee(jobs);
	}

}
