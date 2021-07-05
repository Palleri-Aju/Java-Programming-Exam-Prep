/*

						Experiment-8

Create an interface vehicle and classes like bicycle,
 car, bike etc, having common functionalities
 and put all the common functionalities in the interface.
 Classes like Bicycle, Bike, car etc implement all these
 functionalities in their own class in their own way
*/
interface Vehicle
{
	
	public abstract void showTopSpeed();
	public abstract void noOfSeats();
}
class Bicycle implements Vehicle
{
	String color;
	double price;
	public Bicycle(String color,double price)
	{
		this.color=color;
		this.price=price;
	}
	public void showTopSpeed()
	{
		System.out.println("Bicycle top speed is 30 km/hr");
	}
	public void noOfSeats()
	{
		System.out.println("Bicycle number of seats : 1");
	}
	public void showBicycleDetails()
	{
		System.out.println("Bicycle color : "+color);
		System.out.println("Bicycle price : "+price);
	}
}
class Bike implements Vehicle
{
	/*String color;
	double price;*/
	public void showTopSpeed()
	{
		System.out.println("Bike top speed is 160 km/hr");
	}
	public void noOfSeats()
	{
		System.out.println("Bike number of seats : 1");
	}
}
class Car implements Vehicle
{
	/*String color;
	double price;*/
	public void showTopSpeed()
	{
		System.out.println("Car top speed is 200 km/hr");
	}
	public void noOfSeats()
	{
		System.out.println("Car number of seats : 5");
	}
}
class InterfaceMain
{
	public static void main(String args[])
	{
		Car c=new Car();
		c.noOfSeats();
		Bicycle b=new Bicycle("Red",15000);
		b.showTopSpeed();
		b.noOfSeats();
		b.showBicycleDetails();
	}
}

/*
Output:

F:\java prog>java InterfaceMain
Car number of seats : 5
Bicycle top speed is 30 km/hr
Bicycle number of seats : 1
Bicycle color : Red
Bicycle price : 15000.0

*/