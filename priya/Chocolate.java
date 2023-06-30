class Chocolate{
String beand;
	int size;
	doule noOfChocolate=100;
	String name="Milk bar";
	Chocolate()
	{
		System.out.println("Chocolate is constructor ");
	}
}



class ChocolateRunner{
	public static void main(String[] args)
	{
		System.out.println("Candy runner is main method");
		Chocolate ref=new Chocolate();
		System.out.println(ref.flour);
		System.out.println(ref.size);
		System.out.println(ref.noOfCandy);
		System.out.println(ref.name);
	}
}
		