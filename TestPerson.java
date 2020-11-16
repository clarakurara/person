public class TestPerson {
	public static void main(String[] args) {
		Student s1=new Student(101,"Jose", "Cebu City", 20, "DIC", 1, 20000);
		Student s2=new Student(101,"Jose", "Cebu City", 20, "DIC", 1, 20000);
		System.out.println(s1);
		System.out.println(s2);
		if (s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		s1.display();
	}

}
