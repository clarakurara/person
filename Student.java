
public class Student extends Person{
	private String course;
	private int yearlevel;
	private double tuitionfee;
	
	public Student() {
		super();//implicitly calls Person() or super()
	}
	
	public Student(String course, int yearlevel, double tuitionfee) {
		this.course=course;
		this.yearlevel=yearlevel;
		this.tuitionfee=tuitionfee;
	}
	
	public Student(int idno, String name, String address, int age, String course, int yearlevel, double tuitionfee) {
		super(idno, name, address, age); //a call to the superclass constructor
		this.course=course;
		this.yearlevel=yearlevel;
		this.tuitionfee=tuitionfee;
	}
	
	//Setters
	public void setCourse(String course) {
		this.course = course;
	}
	public void setYearlevel(int yearlevel){
		this.yearlevel=yearlevel;
	}
	public void setTuitionfee(double tuitionfee) {
		this.tuitionfee = tuitionfee;
	}
	
	//Getters
	public String getCourse() {
		return course;
	}
	public double getYearlevel() {
		return yearlevel;
	}
	public double getTuitionfee() {
		return tuitionfee;
	}
	
	//toString
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(super.toString());
		sb.append(" "+course+" "+yearlevel+""+tuitionfee);
		return sb.toString();
	}
	
	//Equals
	public boolean equals(Object obj) {
		boolean ans=false;
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(super.equals(s) && this.course.equals(s.course) && this.yearlevel==s.yearlevel && this.tuitionfee==s.tuitionfee)	
				ans=true;
		}
		return ans;
	}
	
	public void display(){
		System.out.println("Student");
	}
}
