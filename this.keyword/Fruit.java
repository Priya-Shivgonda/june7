class Fruit{
	String name="Apple";
	String color;
	int price;
	Fruit()
	{
		System.out.println("Constructor with no parameter");
	}
	
	Fruit(String name)
	{
		System.out.println("Constructor with parameter  String name");
		this.name=name;
		
	}
	Fruit(String name,String color)
	{
		System.out.println("Constructor with parameter  String name,String color,int price");
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
	Fruit(String name,String color,int price)
	{
		System.out.println("Constructor with parameter  String name,String color,int price");
		this.name=name;
		this.color=color;
		this.price=price;	
	}
}