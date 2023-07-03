class Bread{
    String bakery="bangalore bakery";
	String tasty;
	int size;
	int noOfItemsUsed=5;
	
	Bread()
	{
	System.out.println("Running constructor are bread");
	}
}
	
	
	
	class BreadRunner{
		public static void main(String[] args)
		{
			System.out.println("Running main is good");
			Bread ref=new Bread();
			System.out.prinln(ref.bakery);
			System.out.prinln(ref.taste);
			System.out.prinln(ref.size);
			System.out.prinln(ref.noOfItemsUsed);
		}
	}
			
			
