class MobileRunner{
	  public static void main(String[] args)
      {
		  System.out.println("Running main ...");
		  Mobile ref1=new Mobile();
		  System.out.println(ref1.brand);
		  System.out.println(ref1.color);
		  System.out.println(ref1.price);
		  
		  Mobile ref2=new Mobile("realme");
		  System.out.println(ref2.brand);
		  System.out.println(ref2.color);
		  System.out.println(ref2.price);
		  
		  Mobile ref3=new Mobile("ralme","black");
		  System.out.println(ref3.brand);
		  System.out.println(ref3.color);
		  System.out.println(ref3.price);
		  
		 Mobile ref4=new Mobile("ralme","black",1200);
		  System.out.println(ref4.brand);
		  System.out.println(ref4.color);
		  System.out.println(ref4.price);
	  }
}
		  
		