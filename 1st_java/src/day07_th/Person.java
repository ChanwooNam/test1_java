package day07_th;

public class Person extends Object{
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.printf("이름 : %s  나이 : %d", this.name, this.age);
		} // Test04의 오버라이딩 유도
}

class Student extends Person{ // 상위인 Animal에서 기본생성자 필요
	private int id;
	
	public Student() {
		super();
	}
		
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.print();
		System.out.printf(" 학번 : %d %n",this.id);
	}
	
}

class Teacher extends Person{
	private String subject;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.printf(" 담당과목 : %s %n",this.subject);
	}
		
}

class Employee extends Person{
	private String dept;

	public Employee() {
		super();
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		super.print();
		System.out.printf(" 부서 : %s %n",this.dept);
	}
	
}
