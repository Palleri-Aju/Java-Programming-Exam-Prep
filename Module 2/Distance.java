/*
									Experiment -6

Write a program to create a class called distance having members ft and inches.
Write method to accept feet and inches from the user, and a method to add two distance objects.
Also write a method to display the final result object.

Topics covered:

Basic Input/Output
Method calling
Classes and Objects
passing objects to methods

Example:
d1
ft	inch
4	11

d2
ft	inch
8	6
*/
import java.util.*;
import java.lang.Math;
public class Distance
{
	private int feet;
	private int inches;
	public void getDistance()
	{		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter feet: ");
			feet=sc.nextInt();
			System.out.print("Enter inches: ");
			inches=sc.nextInt();
	}
	public void showDistance()
	{
      	System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
	public void addDistance(Distance D1, Distance D2)
	{
	    inches=D1.inches+D2.inches;
		feet=D1.feet+D2.feet+(inches/12);
		inches=inches%12;
	}
	public static void main(String []s)	
	{
			Distance D1=new Distance();
			Distance D2=new Distance();
			Distance D3=new Distance();	
			System.out.println("Enter first distance: ");
			D1.getDistance();
			System.out.println("Enter second distance: ");
			D2.getDistance();
			D3.addDistance(D1,D2);
			System.out.println("Total distance is:" );
			D3.showDistance();
    }
}

/*
Output:

Enter first distance:
Enter feet: 10
Enter inches: 25
Enter second distance:
Enter feet: 6
Enter inches: 7
Total distance is:
Feet: 18        Inches: 8

*/