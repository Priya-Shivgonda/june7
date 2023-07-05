class FishRunner{
  public static void main(String[] args)
  {
      System.out.println("running main...");
	  Fish ref1=new Fish();
	  System.out.println(ref1.name);
	  System.out.println(ref1.type);
	  System.out.println(ref1.price);
	  System.out.println(ref1.location);
  
      Fish ref2=new Fish("Star fish");
	  System.out.println(ref2.name);
	  System.out.println(ref2.type);
	  System.out.println(ref2.price);
	  System.out.println(ref2.location);
  
      Fish ref3=new Fish("Star fish","Ocean type",180.9);
	  System.out.println(ref3.name);
	  System.out.println(ref3.type);
	  System.out.println(ref3.price);
	  System.out.println(ref3.location);
  
      Fish ref4=new Fish("Star fish","Ocean type",180.9,"fish shop");
	  System.out.println(ref4.name);
	  System.out.println(ref4.type);
	  System.out.println(ref4.price);
	  System.out.println(ref4.location);
  }
}
