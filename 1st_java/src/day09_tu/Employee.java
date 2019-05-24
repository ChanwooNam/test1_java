package day09_tu;

public class Employee {
	
	private String name;
	private String dept;
	public Employee() {
		super();
	}
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override // Source 탭에서 Generate toString()
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}
	
	@Override
	public boolean equals(Object obj) { // ctrl + spacebar 하면 equals함수 나옴
		boolean flag = false;
		if((obj != null && obj instanceof Employee)) {// obj가 Employee 타입일때만
			Employee temp = (Employee) obj;
			if(name.equals(temp.name) && dept.equals(temp.dept)){
				flag = true; // 옵젝타입과 임플타입을 직접비교할수 없어, 임플로 다운캐스팅하여 비교
			}
		}
		return flag;
	}
	
}
