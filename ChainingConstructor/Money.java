class Money{
    String country="USA";
	String currency;
	String denomination;
	String type;
	Money()
	{
		System.out.println("constructor with no-argument ");
	}
	
	Money(String country)
	{
		System.out.println("constructor with argument running String Country");
		this.country=country;	
	}
	
	Money(String country,String currency)
	{
		System.out.println("constructor with argument running String Country,String currency");
		this.country=country;
		this.currency=currency;
		
	}
	
	Money(String country,String currency,String denomination)
	{
		this(country,currency);
		System.out.println("constructor with argument running String Country,String currency,String denomination");
		this.denomination=denomination;
		
	}
	Money(String country,String currency,String denomination,String type)
	{
		this(country,currency,denomination);
		System.out.println("constructor with argument denomination running String country,String currency,String denomination,String type");
		this.type=type;
	}
}