class Candy{
	String flour;
	int size;
	int noOfCandy;
	String name;
	Candy()
	{
		System.out.println("Candy is taste");
	}
}



class CakeRunner{
	public static void main(String[] args)
	{
		System.out.println("Candy runner is main method");
		Cake ref=new Cake();
		System.out.println(ref.flour);
		System.out.println(ref.size);
		System.out.println(ref.noOfCangy);
		System.out.println(ref.name);
	}
}
		
