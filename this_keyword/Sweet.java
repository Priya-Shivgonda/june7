class Sweet{
	String name="Honey";
	String color;
	int price=80;
	Sweet()
	{
		System.out.println("Constructor with no parameter");
	}
	
	Sweet(String name)
	{
		System.out.println("Constructor with parameter  String name");
		this.name=name;
		
	}
	Sweet(String name,String color)
	{
		System.out.println("Constructor with parameter  String name,String color,int price");
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
	Sweet(String name,String color,int price)
	{
		System.out.println("Constructor with parameter  String name,String color,int price");
		this.name=name;
		this.color=color;
		this.price=price;	
	}
}