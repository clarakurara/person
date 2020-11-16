public class Employee extends Person{
	private String department;
	private double salary;

	//Encapsulate
	public Employee() {
		super();//implicitly calls Person() or super()
	
	}
	public Employee(String department, double salary) {
		this.setDepartment(department);
		this.setSalary(salary);
	}
	public Employee(int idno, String name, String address, int age, String department, double salary) {
		super(idno, name, address, age);
		this.setDepartment(department);
		this.setSalary(salary);
	}
	
	//Setters
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Getters
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
		
	//Override toString
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(super.toString());
		sb.append(" "+department+" "+salary);
		return sb.toString();
	}
	
	//Equals
	public boolean equals(Object obj) {
		boolean ans=false;
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
			if(super.equals(e) && this.department.equals(e.department) && this.salary==e.salary)
				ans=true;
		}
		return ans;
	}
	
	//to display
	public void display(){
		System.out.println("Employee");
	}
}
	
