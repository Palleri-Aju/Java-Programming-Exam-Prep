/* 			EXPERIMENT -2
Write a Menu driven program in java to implement
simple banking application. Application should read
the customer name, account number, initial balance,
rate of interest, contact number and address field etc.
Application should have following methods.

1. createAccount()						javac BankApp.java
2. deposit()
3. withdraw()
4. computeInterest()
5. displayBalance() */

import java.util.*;
public class BankApp
{
	String name,address;
	int accno,mob;
	double bal,rate;
	public static void main(String[] args)
	{
		int ch,flag=0;
		Scanner sc=new Scanner(System.in);
		BankApp bank=new BankApp();			
		do{
			System.out.println("**WELCOME TO THE BANKING APPLICATION**");
			System.out.println("----------:MENU:------------");
			System.out.println("ENTER 1 TO CREATE NEW ACCOUNT");
			System.out.println("ENTER 2 TO DEPOSIT MONEY");
			System.out.println("ENTER 3 TO WITHDRAW MONEY");
			System.out.println("ENTER 4 TO COMPUTE INTEREST");
			System.out.println("ENTER 5 TO DISPLAY BALANCE");
			System.out.println("ENETR 6 TO CLOSE THE APP");
			ch=sc.nextInt();
			if(ch==1)
			{   
				bank.createAccount();
				flag=1;   
				do
				{
					System.out.println("----------:MENU:------------");
					System.out.println("ENTER 1 TO DEPOSIT MONEY");
					System.out.println("ENTER 2 TO WITHDRAW MONEY");
					System.out.println("ENTER 3 TO COMPUTE INTEREST");
					System.out.println("ENTER 4 TO DISPLAY BALANCE");
					System.out.println("ENETR 5 TO CLOSE THE APP");
					ch=sc.nextInt();
					switch(ch)
						{
						case 1 : bank.deposit();
								break;
						case 2 : bank.withdraw();
								break;
						case 3 : bank.computeInterest();
								break;
						case 4 : bank.displayBalance();
								break;
						case 5 : break;
						default:System.out.println("INVALID CHOICE!");
						}
				}while(ch!=5);
			}
			else if(ch<6)
			{
				System.out.println("FIRST CREATE ACCOUNT!");
			}
			else if(ch==6)
			{
				break;
			}
			else
			{
					System.out.println("Invalid Choice ");
			}
		}while(flag==0);
	}
	public void createAccount()
	{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE CUSTOMER NAME: ");
			name=sc.nextLine();
			System.out.println("ENTER THE CUSTOMER ADDRESS: ");
			address=sc.nextLine();
			System.out.println("ENTER THE ACCOUNT NUMBER: ");
			accno=sc.nextInt();
			System.out.println("ENTER THE INITIAL BALANCE: ");
			bal=sc.nextDouble();
			System.out.println("ENTER THE RATE OF INTEREST: ");
			rate=sc.nextDouble();
			System.out.println("ENTER THE CONTACT NUMBER: ");
			mob=sc.nextInt();
			System.out.println("ACCOUNT CREATED SUCCESSFULLY!");
			}
public void deposit()
			{
				double dep;
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT: ");
				dep=sc.nextDouble();
				bal=bal+dep;
				System.out.println("SUCCESSFULLY DEPOSITED THE MONEY!");
				System.out.println("YOUR CURRENT ACCOUNT BALANCE IS "+bal);
			}
public void withdraw()
			{
				double wd;
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW: ");
				wd=sc.nextDouble();
				if(wd>bal)
				{
					System.out.println("Insufficient balance!!");
				}
				else
				{
					bal=bal-wd;
					System.out.println("SUCCESSFULLY WITHDRAWN THE MONEY!");
					System.out.println("YOUR CURRENT ACCOUNT BALANCE IS "+bal);
				}
			}
public void computeInterest()
			{
				int t;
				double interest;
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE TIME SPAN IN YEARS: ");
				t=sc.nextInt();
				interest=bal*(rate/100)*t;
				System.out.println("INTEREST WILL BE "+interest+" ON YOUR CURRENT BALANCE OF RS. "+bal+" IN "+t+" YEARS ");
			}
public void displayBalance()
			{
				System.out.println("YOUR CURRENT ACCOUNT BALANCE IS "+bal);
			}	
}
