package studyopedia;

public class Fan {
	int no_Of_Wings;
	String color;
	int cost;
	String brand;
	public Fan(int no_Of_Wings,String color,int cost,String brand)
	{
		this.no_Of_Wings=no_Of_Wings;
		this.color=color;
		this.cost=cost;
		this.brand=brand;
		
	}
	void rotate()
	{
		System.out.println("The "+brand+" brand fan has a "+no_Of_Wings+" and cost is "+cost+" is rotating");
	}
	void blow_Air()
	{
		System.out.println("The "+brand+" brand fan has a "+no_Of_Wings+" and cost is "+cost+" is blowing air");
	}

}
