/*
							Experiment - 9

Create a class "Amount In Words" within a user defined package to convert the amount into words.
(Consider amount not to be more than 100000).

*/
import java.util.Scanner;
class AmountinWords1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		String number =Integer.toString(n);
		if(n>100000)
		{
			
			System.out.println("Invlaid Input!!!\nEntered number is greater than 100000");
			System.exit(0);
		}
		String[] ones = { 
						"", "one", "two", "three", "four", 
						"five", "six", "seven", "eight", 
						"nine", "ten", "eleven", "twelve", 
						"thirteen", "fourteen", "fifteen", 
						"sixteen", "seventeen", "eighteen", 
						"nineteen"};
 
		String[] tens = {
						"",          // 0
						"",          // 1
						"twenty",    // 2
						"thirty",    // 3
						"forty",     // 4
						"fifty",     // 5
						"sixty",     // 6
						"seventy",   // 7
						"eighty",    // 8
						"ninety"     // 9
		};
		String str="";
		String thousand="";
		if(n>999)
		{
			if(n>9999)
			{
				thousand=number.substring(0,2);
			}
			else
			{
				thousand=number.substring(0,1);
			}
			//System.out.println(thousand);
			int th=Integer.parseInt(thousand);
			if(th<20)
			{
					str= ones[th];
			}
			else
			{
					str= tens[th/10]+" "+ones[th%10];
			}
			str=str+" thousand";
			//System.out.println(str);
		}
		int rem=n%1000;
		//System.out.println(rem);
		int k=rem;
		if(rem/100!=0)
		{
			str+=" "+ones[rem/100]+" hundred ";
			rem=rem%100;
			if(rem==0)
			{
				System.out.println(str+" ");
			}
			else if(rem<20)
			{
				System.out.println(str+" "+ones[rem]);
			}
			else if(rem<100)
			{
				System.out.println(str+" "+tens[rem/10]+" "+ones[rem%10]);
			}
		}
		else
		{
			if(rem==0)
			{
				if(n==0)
					System.out.println("Zero");
				else
					System.out.println(str);
			}
			else if(rem<20)
			{
				System.out.println(str+" "+ones[rem]);
			}
			else if(rem<100)
			{
				System.out.println(str+" "+tens[rem/10]+" "+ones[rem%10]);
			}
		}
		
	}
}

/*

Output:

F:\java prog>java AmountinWords1
Enter a number :
1000
one thousand

F:\java prog>java AmountinWords1
Enter a number :
10000
ten thousand

F:\java prog>java AmountinWords1
Enter a number :
30000
thirty  thousand

F:\java prog>java AmountinWords1
Enter a number :
24567
twenty four thousand five hundred  sixty seven

F:\java prog>java AmountinWords1
Enter a number :
500
 five hundred

F:\java prog>java AmountinWords1
Enter a number :
1001
one thousand one

*/