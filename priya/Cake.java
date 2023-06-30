class Cake{
	String flour;
	int size;
	int weight=2kg;
	String name;
	Cake();
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
		System.out.prinln(ref.size);
		System.out.prinln(ref.weight);
		System.out.prinln(ref.name);
	}
}
		
		