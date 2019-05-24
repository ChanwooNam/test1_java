package day08_fr;

import static java.lang.Math.PI;

import day08_fr.Animal;

import static java.lang.Math.*;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println(random());
		
		Fish f = new Fish("연어");
		Dog d = new Dog("시바","진돗");
		
		Animal a = f;
		
		a.breath();
		a.print();
		
		exec(f);
		exec(d);
		
		}
	
	public static void exec(Animal f) {
		f.breath();
		f.print();
	}
	
}
