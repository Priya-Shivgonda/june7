class IceCream{
    String flour="Buttet scotch";
	int size;
	int price=100;
	String company;
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
		System.out.println(ref.company);
	}
}
		