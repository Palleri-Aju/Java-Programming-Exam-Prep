import java.util.Scanner;
class Operations
{
	double pi=3.141592653589793238;
	public double calcVolume(double rad)
	{
		return (4*pi*Math.pow(rad,3))/3.0;
	}
	public double calcVolume(double rad,double ht)
	{
		return pi*Math.pow(rad,2)*ht;
	}
	public static void main(String args[])
	{
		Operations op1=new Operations();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of sphere :");
		double rad1=sc.nextDouble();
		System.out.println("Volume of Sphere :"+op1.calcVolume(rad1));
		System.out.print("Enter radius of Cylinder :");
		double rad2=sc.nextDouble();
		System.out.print("Enter height of Cylinder :");
		double ht=sc.nextDouble();
		System.out.println("Volume of Cylinder :"+op1.calcVolume(rad2,ht));
	}
}

/*
Output:
Enter radius of sphere :12
Volume of Sphere :7238.229473870883
Enter radius of Cylinder :5
Enter height of Cylinder :7
Volume of Cylinder :549.7787143782139
*/