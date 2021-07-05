/*

								Experiment-11

Assume that two brothers, Joe and John, share a common bank account. 
They both can, independently, read the balance, make a deposit, and withdraw some money. 
Implement java application demonstrate how the transaction in a bank can be carried out concurrently.

*/

class Account
{ 
	double bal=5000;
	void showBalance()
	{
		System.out.println("Account balance of "+Thread.currentThread().getName()+" is :"+bal);
	}
	synchronized void depositAmount(double n)
	{
		System.out.println("\nAmount "+n+" deposited by "+Thread.currentThread().getName());
		bal=bal+n;
		showBalance();
	}
	synchronized void withdrawAmount(double n)
	{
		if(bal-n>0)
		{
			bal=bal-n;
			System.out.println("\nAmount "+n+" withdrawn by "+Thread.currentThread().getName());
			showBalance();
		}
		else
		{
			System.out.println("Insufficient Balance !!!");
		}
	}  
}  
  
class MyThread1 extends Thread
{  
	Account t;  
	MyThread1(Account t)
	{  
		this.t=t;  
	}  
	public void run(){  
		t.depositAmount(2000);
		t.withdrawAmount(1500);
	}  
}  
class MyThread2 extends Thread
{  
	Account t;  
	MyThread2(Account t)
	{  
		this.t=t;  
	}  
	public void run(){  
		t.depositAmount(3000);
		t.withdrawAmount(5000);
	}  
}  
  
class TestSynchronization2
{  
	public static void main(String args[])
	{  
		Account obj1 = new Account();//only one object  
		Account obj2 = new Account();//only one object  
		MyThread1 t1=new MyThread1(obj1); 
		t1.setName("Joe"); 
		MyThread2 t2=new MyThread2(obj1);  
		t2.setName("John");
		t1.start();  
		t2.start();  
	}  
}  

/*
Output:

F:\java prog>java TestSynchronization2

Amount 2000.0 deposited by Joe
Account balance of Joe is :7000.0

Amount 1500.0 withdrawn by Joe
Account balance of Joe is :5500.0

Amount 3000.0 deposited by John
Account balance of John is :8500.0

Amount 5000.0 withdrawn by John
Account balance of John is :3500.0


*/
