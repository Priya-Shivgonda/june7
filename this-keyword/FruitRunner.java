class  FruitRunner{
	  public static void main(String[] args)
      {
		  System.out.println("Running main ...");
		  Fruit ref1=new Fruit();
		  System.out.println(ref1.name);
		  System.out.println(ref1.color);
		  System.out.println(ref1.price);
		  
		  Fruit ref2=new Fruit("Apple");
		  System.out.println(ref2.name);
		  System.out.println(ref2.color);
		  System.out.println(ref2.price);
		  
		  Fruit ref3=new Fruit("Apple","red");
		  System.out.println(ref3.name);
		  System.out.println(ref3.color);
		  System.out.println(ref3.price);
		  
		  Fruit ref4=new Fruit("Apple","red",140);
		  System.out.println(ref4.name);
		  System.out.println(ref4.color);
		  System.out.println(ref4.price);
	  }
}
		  
		