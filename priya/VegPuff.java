class VegPuff{
	String bakery="Numan bakery";
	int size;
	int price=50;
	String name;
	VegPuff()
	{
		System.out.println("Vegpuff is a constructor");
	}
}



class  VegPuffRunner{
	public static void main(String[] args)
	{
		System.out.println("cake runner is main method");
		VegPuff ref=new VegPuff();
		System.out.println(ref.bakery);
		System.out.println(ref.size);
		System.out.println(ref.price);
		System.out.println(ref.name);
	}
}
		
