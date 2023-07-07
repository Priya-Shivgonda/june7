class Stove{
    String type;
	double length;
	boolean electricStove;
	int noOfBurners;
	int capacity;
	int  price;
	double width;
	double weight;
	
	
	Stove(String type,double length,boolean electricStove,int noOfBurners,int capacity,int price,double width,double weight)
	
	{
		
		System.out.println("constructor with args  String type,double length,boolean electricStove,int noOfBurners,int capacity,int price,double width,double weight");
		this.type=type;
		this.length=length;
		this.electricStove=electricStove;
		this.noOfBurners=noOfBurners;
		this.capacity=capacity;
		this.price=price;
		this.width=width;
		this.weight=weight;	
	}
}