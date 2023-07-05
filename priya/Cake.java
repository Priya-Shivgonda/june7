class Cake{
	String flour="Pineapple";
	int no_of_cakes=20;
	int weight;
	String name;
	Cake()
	{
		System.out.println("cake is taste");
	}
}



class CakeRunner{
	public static void main(String[] args)
	{
		System.out.prinln("Cake runner is main method");
		Cake ref=new Cake();
		System.out.prinln(ref.flour);
		System.out.prinln(ref.no_of_cakes);
		System.out.prinln(ref.weight);
		System.out.prinln(ref.name);
	}
}
		
		
