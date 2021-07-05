/*Write a java programs to add n strings in a vector
array. Input new string and check whether it is present
in the vector. If it is present delete it otherwise add it to
the vector.
*/
import java.util.Vector;
import java.util.Scanner;
class Vector3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		String s;
		System.out.print("Enter number of Strings to be entered :");
		int n=sc.nextInt();
		sc.nextLine();
		int count=0;
		while(count!=n)
		{
			System.out.print("Enter a String :");
			s=sc.nextLine();
			if(v.contains(s))
			{
				v.remove(s);
				System.out.println("Element removed Successfully!!");
				count--;
			}
			else
			{
				v.addElement(s);
				System.out.println("Element added Successfully!!");
				count++;
			}
			System.out.println("Elements of the Vector are");
			for(int i=0;i<v.size();i++)
			{
				System.out.println(v.elementAt(i));
			}
			System.out.println("_________________________");
		}
	}
}

/* Output

F:\java prog>javac Vector3.java
Note: Vector3.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java prog>java Vector3
Enter number of Strings to be entered :4
Enter a String :Ajay
Element added Successfully!!
Elements of the Vector are
Ajay
_________________________
Enter a String :Namit
Element added Successfully!!
Elements of the Vector are
Ajay
Namit
_________________________
Enter a String :Shreha
Element added Successfully!!
Elements of the Vector are
Ajay
Namit
Shreha
_________________________
Enter a String :Namit
Element removed Successfully!!
Elements of the Vector are
Ajay
Shreha
_________________________
Enter a String :Mohit
Element added Successfully!!
Elements of the Vector are
Ajay
Shreha
Mohit
_________________________
Enter a String :srishti
Element added Successfully!!
Elements of the Vector are
Ajay
Shreha
Mohit
srishti

*/