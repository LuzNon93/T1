

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Washer w1=new Washer();
		System.out.println("Washer Price:" +w1.price+", color: "+w1.color+", weight: "+w1.weight+"kg");
		Tv t1=new Tv();
		System.out.println("Tv Price:$" +t1.price+", color: "+t1.color+", weight: "+t1.weight+"kg");
		System.out.println("Channels:" +t1.channels+", Size: "+t1.size+"cm");
		t1.CheckColor();
		t1.CheckPrice();
		w1.price=59.99;
		w1.CheckPrice();
		System.out.println("Washer Price:$" +w1.price+", color: "+w1.color+", weight: "+w1.weight+"kg");
		t1.price=470.55;
		t1.CheckPrice();
		System.out.println("Tv Price:$" +t1.price+", color: "+t1.color+", weight: "+t1.weight+"kg");
		System.out.println("Channels:" +t1.channels+", Size: "+t1.size+"cm");
	}

}
