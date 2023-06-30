class Biscuit{
	String name="Parle";
	int price;
	String brand;
	int packets=100;
	
	Biscuit(){
	{
		System.out.println(" --Running constructor is biscuit ---");
	}
}



class BiscuitRunner{
	public static void main(String[] args)
	{
		System.out.println("Biscuit runner main method");
		Biscuit ref=new Biscuit();
		Systm.out.println(ref.name);
		Systm.out.println(ref.price);
		Systm.out.println(ref.brand);
		Systm.out.println(ref.packets);
	}
}
		
