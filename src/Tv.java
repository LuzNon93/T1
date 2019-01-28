/***Create a tv class and inherit the base class
    1) Implement a default constructor
    2) Change the price to any different amount
    3) Call the checkPrice method from the parent class
    4) Add a channels property
    5) Add a display size property
    5) add a method called changeChannel()*/
public class Tv extends ElectroDomestic {
	int channels=20;
	double size=28;

	
	public Tv(){
		
	}
	
	public Tv(double price,String color, int weight, int channels, double size) 
	{
		super(price,color,weight);
		this.channels=channels;
		this.size=size;
	}
	
     public void ChangeChannel() 
     {
		
	 }
}
