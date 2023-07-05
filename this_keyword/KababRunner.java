class KababRunner{
  public static void main(String[] args)
  {
      System.out.println("running  main ...");
	  Kabab ref1=new Kabab();
	  System.out.println(ref1.name);
	  System.out.println(ref1.price);
	  System.out.println(ref1.hotelName);
	  System.out.println(ref1.noOfPieces);
	  System.out.println(ref1.takeAway);
  
      Kabab ref2=new Kabab("mutton kabab");
	  System.out.println(ref2.name);
	  System.out.println(ref2.price);
	  System.out.println(ref2.hotelName);
	  System.out.println(ref2.noOfPieces);
	  System.out.println(ref2.takeAway);
  
      Kabab ref3=new Kabab("Chicken",340,"Mandya");
	  System.out.println(ref3.name);
	  System.out.println(ref3.price);
	  System.out.println(ref3.hotelName);
	  System.out.println(ref3.noOfPieces);
	  System.out.println(ref3.takeAway);
	 
      Kabab ref4=new Kabab("Chicken",340,"Mandya",7);
	  System.out.println(ref4.name);
	  System.out.println(ref4.price);
	  System.out.println(ref4.hotelName);
	  System.out.println(ref4.noOfPieces);
	  System.out.println(ref4.takeAway);
	  
	  Kabab ref5=new Kabab("Chicken",340,"Mandya",7,true);
	  System.out.println(ref5.name);
	  System.out.println(ref5.price);
	  System.out.println(ref5.hotelName);
	  System.out.println(ref5.noOfPieces);
	  System.out.println(ref5.takeAway);
	  
  }
}
