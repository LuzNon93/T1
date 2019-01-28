/****Create a base class named Electro domestic
     Add the following attributes: price, color, weight
     Default values for are white color, price 100 and weight of 5kg
     Available colours are white, black, blue and grey

Implement the following constructors:
Default
Weight and price
All 3 attributes
Implement the following methods
    1) CheckColor()
    2) CheckPrice()*/


public class ElectroDomestic {
	double price=100;
    String color="white";
	int weight=5;
	
	public ElectroDomestic() {
		
	}
	
	public ElectroDomestic(double price, int weight) 
	{
		this.price=price;
		this.weight=weight;
	}

	public ElectroDomestic(double price,String color, int weight) 
	{
		this.price=price;
		this.color=color;
		this.weight=weight;
	}
	 
    
	public void CheckColor() {
		System.out.println("Color: "+color);
		
	}
	
	public void CheckPrice() {
		System.out.println("Price: $"+price);
		
	}
}
