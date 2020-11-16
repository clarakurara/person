public class Person{
	private int idno;
	private String name;
	private String address;
	private int age;

	//Encapsulate
	public Person(){
		//this(0,"John",18);
	}
	public Person(int idno, String name, String address, int age){
		this.idno = idno;
		this.name = name;
		this.address=address;
		this.age = age;
	}
	
	//Setters
	public void setIdno(int idno){
		this.idno = idno;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	//Getters
	public int getIdno(){
		return idno;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getAge(){
		return age;
	}

	//Override toString
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(idno + " " + name + " " +address+ " " + age);
		return sb.toString();
	}

	
	public boolean equals(Object obj){
		boolean ans = false;
		if(obj instanceof Person){
			Person p = (Person)obj;
			if(this.idno==p.idno && this.name.equals(p.name) && this.address.equals(p.address) && this.age==p.age)
				ans = true;
		}
		return ans;
	}
	
	//from class Person
	public void display(){
		System.out.println("Person");
	}
}

