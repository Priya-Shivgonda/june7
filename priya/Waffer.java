class Waffer{
	String flour;
	int size;
	int orders;
	String name;
	Waffer()
	{
	 System.out.println("waffer  is  constructor");
	}
    }

class WafferRunner{
	public static void main(String[] args)
	{
		System.out.println("cake runner is main method");
		Waffer ref=new Wafffer();
		System.out.println(ref.flour);
		System.out.println(ref.size);
		System.out.println(ref.orders);
		System.out.println(ref.name);
	}
}
		
