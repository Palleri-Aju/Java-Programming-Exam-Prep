/*
									Experiment-7

A university has two types of students — graduate students and research students. 
The University maintains the record of name, age and programme of every student. 
For graduate students, additional information like percentage of marks and stream, 
like science, commerce, etc. is recorded; whereas for research students, additionally,
specialization and years of working experience, if any, is recorded. Each class has a constructor.
The constructor of subclasses makes a call to constructor of the superclass. 
Assume that every constructor has the same number of parameters as the number of instance variables.
In addition, every subclass has a method that may update the instance variable values of that subclass.
All the classes have a function display_student_info( ), the subclasses must override this method of 
the base class. Every student is either a graduate student or a research student.

Perform the following tasks for the description given above using Java :
(i) Create the three classes with proper instance variables and methods, with suitable inheritance.
(ii) Create at least one parameterised constructor for each class.
(iii) Implement the display_student_info( ) method in each class.

*/	
import java.util.*;
class Student
{
	private String name,program;
	private int age;
	public Student(String name,String program,int age)
	{
		this.name=name;
		this.program=program;
		this.age=age;
	}
	public void update(String name,String program,int age)
	{
		this.name=name;
		this.program=program;
		this.age=age;
	}
	public void display_student_info()
	{
		System.out.println("Name :"+name+" Program="+program+" Age="+ age);
	}
}
class Graduate extends Student
{
	double percent;
	String stream;
	public Graduate(String name,String program,int age,double percent,String stream)
	{
		super(name,program,age);
		this.percent=percent;
		this.stream=stream;
	}
	public void update(String name,String program,int age,double percent,String stream)
	{
		super.update(name,program,age);
		this.percent=percent;
		this.stream=stream;
	}
	public void display_student_info()
	{
		super.display_student_info();
		System.out.println("Percentage:"+percent+" Stream="+stream);
	}
}
class Research extends Student
{
	int exp;
	String spec;
	public Research(String name,String program,int age,int exp,String spec)
	{
		super(name,program,age);
		this.exp=exp;
		this.spec=spec;
	}
	public void update(String name,String program,int age,int exp,String spec)
	{
		super.update(name,program,age);
		this.exp=exp;
		this.spec=spec;
	}
	public void display_student_info()
	{
		super.display_student_info();
		System.out.println("Specialization:"+spec+" Experience="+exp);
	}
}
class StudentMain
{
	public static void main(String args[])
	{
		Graduate g=new Graduate("Dinesh","Data Science",20,85.50,"IT");
		g.display_student_info();
		g.update("Dinesh","Data Science",20,83.50,"CS");
		g.display_student_info();
		System.out.println("------------------------------------------");
		Research r=new Research("Ritika","AI and ML",20,3,"Neural Networks");
		r.display_student_info();
		r.update("Ritika","AI",20,4,"Data Warehousing");
		r.display_student_info();
	}
}

/*
Output:

Name :Dinesh Program=Data Science Age=20
Percentage:85.5 Stream=IT
Name :Dinesh Program=Data Science Age=20
Percentage:83.5 Stream=CS
------------------------------------------
Name :Ritika Program=AI and ML Age=20
Specialization:Neural Networks Experience=3
Name :Ritika Program=AI Age=20
Specialization:Data Warehousing Experience=4

*/