class Candy{
	String flour;
	int size;
	int noOfCandy;
	String name;
	Candy()
	{
		System.out.println("Candy is tasty");
	}
}



class CandyRunner{
	public static void main(String[] args)
	{
		System.out.println("Candy runner is main method");
		Candy ref=new Candy();
		System.out.println(ref.flour);
		System.out.println(ref.size);
		System.out.println(ref.noOfCandy);
		System.out.println(ref.name);
	}
}
		
