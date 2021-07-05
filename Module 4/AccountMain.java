/*
						Experiment-10

Java Program to Create Account with 1000 Rs Minimum Balance, 
Deposit Amount, Withdraw Amount and Also Throws LessBalanceException. 
It has a Class Called LessBalanceException Which returns the Statement
that Says WithDraw Amount(_Rs) is Not Valid. 
It has a Class Which Creates 2 Accounts, Both Account Deposite Money and
One Account Tries to WithDraw more Money which Generates a LessBalanceException.
Take Appropriate Action for the Same.

*/

class LessBalanceException extends Exception
{
	public LessBalanceException(String s)
	{
		
		super(s);
	}
}
class Account
{
	double bal;
	final double minBal=1000;
	public Account(double bal)
	{
		this.bal=bal;
	}
	public void depositAmount(double amt)
	{
		if(amt<=0)
		{
			System.out.println("Enter valid amount to deposit");
		}
		else
		{
			bal=amt+bal;
			System.out.println("Rupees "+amt+" deposited successfully!!!");
			System.out.println("Balance in your account is "+bal);
		}
	}
	public void withdrawAmount(double amt)throws LessBalanceException
	{
		if(amt<=0)
		{
			System.out.println("Enter valid amount to withdraw");
		}
		else
		{
			double temp=bal-amt;
			if(temp<minBal)
			{
				throw new LessBalanceException("Withdrawal amount of Rs "+amt+" is not valid");
			}
			else
			{
				bal=temp;
				System.out.println("Withdrawal Successful");
				System.out.println("Balance in your account is "+bal);
			}
		}
		
	}
}
class AccountMain
{
	public static void main(String args[])
	{
			Account a1=new Account(10000);
			a1.depositAmount(2000);
			try
			{
				a1.withdrawAmount(5000);
			}
			catch(Exception e)
			{
				System.out.println("Exception handled\n"+e);
			}
			try
			{
				a1.withdrawAmount(6200);
			}
			catch(Exception e)
			{
				System.out.println("Exception handled\n"+e);
			}
	}
	
}

/*
Output:

E:\java class>java AccountMain
Rupees 2000.0 deposited successfully!!!
Balance in your account is 12000.0

Withdrawal Successful
Balance in your account is 7000.0

Exception handled
LessBalanceException: Withdrawal amount of Rs 6200.0 is not valid

*/