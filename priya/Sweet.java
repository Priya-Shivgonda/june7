class Sweet{
        String brand;
	int size;
	int price=100;
	String name="Mysore pak";
	Sweet()
	{
		System.out.println("Sweet is taste");
	}
}



class SweetRunner{
	public static void main(String[] args)
	{
		System.out.println("Sweet runner is main method");
		Sweet ref=new Sweet();
		System.out.println(ref.brand);
		System.out.println(ref.size);
		System.out.println(ref.price);
		System.out.println(ref.name);
	}
}
		
