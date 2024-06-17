import java.util.Scanner;

class Emp{
	int id ,age;
	String name;
	Emp(){
		Scanner sc= new Scanner(System.in);
		System.out.println("hi employee....");
		id=sc.nextInt();
		name=sc.next();
		age=sc.nextInt();
	}
}
class Devn extends Emp{
	float salary=50000;
	String desig="Developer";
	void display() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee salary:"+salary);
		System.out.println("Employee designation:"+desig);
	}
}
class Clerkn extends Emp{
	float salary=20000;
	String desig="Clerk";	
	void display() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee salary:"+salary);
		System.out.println("Employee designation:"+desig);
	}
}
class Managern extends Emp{
	float salary=80000;
	String desig="Manager";
	void display() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee salary:"+salary);
		System.out.println("Employee designation:"+desig);
	}
}
class Testern extends Emp{
	float salary=30000;
	String desig="Tester";
	void display() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee salary:"+salary);
		System.out.println("Employee designation:"+desig);
	}
}
public class Demo6 {
	public static void main(String[] args) {
		/*System.out.println("******************Developer Details*******************");
		Devn d= new Devn();
		d.display();
		
		System.out.println("******************Manager Details*******************");
		Managern m= new Managern();
		m.display();
		
		System.out.println("******************Clerk Details*******************");
		Clerkn c= new Clerkn();
		c.display();
		
		System.out.println("******************Tester Details*******************");
		Testern t= new Testern();
		t.display();
		*/
		
		int ch1,ch2=0;
		Clerkn c=null;
		Devn d=null;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("1: CREATE");
			System.out.println("2: DISPLAY");
			System.out.println("3: EXIT");
			ch1=sc.nextInt();
			if(ch1==1) {
				do {
					System.out.println("1: CLERK");
					System.out.println("2: MANAGER");
					System.out.println("3: DEVELOPER");
					System.out.println("4: TESTER");
					System.out.println("5: EXIT");
					ch2=sc.nextInt();
					if(ch2==1) {
						c=new Clerkn();
					}
					if(ch2==3) {
						d=new Devn();
					}
				}
				while(ch2<=5);
			}
			if(ch1==2) {
				c.display();
				d.display();
			}
			if(ch1==3) {
				System.out.println("******THANK YOU*****");
				System.exit(0);
			}
			}
		while(ch1<=3);
	}
}
