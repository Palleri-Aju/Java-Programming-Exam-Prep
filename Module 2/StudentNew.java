/*
					Experiment - 4
					
Create a class 'Student' with three data members
which are name, age and address. The constructor of
the class assigns default values name as "unknown",
age as '0' and address as "not available". It has two
members with the same name 'setInfo'. First method
has two parameters for name and age and assigns the
same whereas the second method takes has three
parameters which are assigned to name, age and
address respectively. Print the name, age and address
of 10 students. Hint - Use array of objects.
*/
import java.util.*;
class StudentNew
{
	private String name,address;
	private int age;
	public StudentNew()
	{
		name="unknown";
		age=0;
		address="not available";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Name = "+name+"\t\tage= "+age+"\t\taddress= "+address+"\n");
	}
	public static void main(String args[])
	{
		StudentNew s[]=new StudentNew[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=1;i++)
		{
			s[i]=new StudentNew();
			System.out.println("\nEnter details of Student :"+(i+1));
			if(i%2==0)
			{
				System.out.print("\nEnter Student name :");
				String name=sc.nextLine();
				System.out.print("Enter Student age :");
				int age=sc.nextInt();
				sc.nextLine();
				s[i].setInfo(name,age);
			}
			else
			{
				System.out.print("\nEnter Student name :");
				String name=sc.nextLine();
				System.out.print("Enter Student age :");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Student address :");
				String address=sc.nextLine();
				s[i].setInfo(name,age,address);
			}
		}
		System.out.println("\n*****Student Details *****");
		for(int i=0;i<=1;i++)
		{
			s[i].display();
		}
	}
	
}



/*
Output:

Enter details of Student :1

Enter Student name :Jayesh
Enter Student age :17

Enter details of Student :2

Enter Student name :Mahesh
Enter Student age :18
Enter Student address :Navi Mumbai

*****Student Details *****
Name = Jayesh           age= 17         address= not available

Name = Mahesh           age= 18         address= Navi Mumbai


*/