class IceCream{
        String flour="Butterscotch";
	int size;
	int price=100;
	String color;
	IceCream()
	{
		System.out.println("Icecream is cool ");
	}
}



class IceCreamRunner{
	public static void main(String[] args)
	{
		System.out.println("IceCream runner is main method");
		IceCream ref=new IceCream();
		System.out.println(ref.flour);
		System.out.println(ref.size);
		System.out.println(ref.price);
		System.out.println(ref.color);
	}
}
		
