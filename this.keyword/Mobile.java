class Mobile{
	String brand;
	String color ;
	int price=12000;
	Mobile()
	{
		System.out.println("Constructor with no parameter");
	}
	
   Mobile(String brand)
	{
		System.out.println("Constructor with parameter  String brand");
		this.brand=brand;
		
	}
	Mobile(String brand,String color)
	{
		System.out.println("Constructor with parameter  String brand,String color,int price");
		this.brand=brand;
		this.color=color;
		this.price=price;
		
	}
	Mobile(String brand,String color,int price)
	{
		System.out.println("Constructor with parameter  String brand,String color,int price");
		this.brand=brand;
		this.color=color;
		this.price=price;	
	}
}