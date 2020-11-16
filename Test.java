import java.util.*;

public class Test {
	public static void main (String[] args) {
//		Person p;
//		p=new Student();
//		p.display();
//		p=new Employee();
//		p.display();
//		
		Scanner input=new Scanner(System.in);
		Person[]p=new Person[5]; //an array of Person references
		for (int i=0; i<p.length;i++){
			System.out.println("What type of person[1: Student, 2: Employee]? ");
			int ans=input.nextInt();
			if(ans==1)
				p[i]=new Student();
			else
				p[i]=new Employee();
		}
		for(int i=0; i<p.length;i++) {
			p[i].display();
		}
	}
}
