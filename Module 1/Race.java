/*
								Experiment-1
								
Five Bikers Compete in a race such that they drive at a constant speed 
which may or may not be the same as the other. To qualify the race, 
the speed of a racer must be more than the average speed of all 5 racers. 
Write a Java program to take as input the speed of each racer 
and print back the speed of qualifying racers.
*/
import java.util.*;
class Race{
	public static void main(String args[]){
		 int racer[]=new int[5];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<5;i++)
		 {
			System.out.print("Enter speed of racer "+ (i+1)+" :");
			racer[i]=sc.nextInt();
		}
		System.out.println("**************************");
		for(int i=0;i<5;i++)
		 {
			System.out.println("Speed of racer "+ (i+1)+" is : "+racer[i]);
		}
		System.out.println("**************************");
		float avg,sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+racer[i];
		}
		avg=sum/5;
		System.out.println("Average Speed of the racer = "+avg);
		System.out.println("**************************");
		System.out.println("Racers qualified are:");
		System.out.println("**************************");
		for(int i=0;i<5;i++)
		{
			if(racer[i]>=avg)
			{
				System.out.println("Racer "+(i+1)+" has qualified, speed = "+racer[i]);
			}
		}
	}
}



