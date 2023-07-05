class  SweetRunner{
	  public static void main(String[] args)
      {
		  System.out.println("Running main ...");
		  Sweet ref1=new Sweet();
		  System.out.println(ref1.name);
		  System.out.println(ref1.color);
		  System.out.println(ref1.price);
		  
		  Sweet ref2=new Sweet("Honey");
		  System.out.println(ref2.name);
		  System.out.println(ref2.color);
		  System.out.println(ref2.price);
		  
		  Sweet ref3=new Sweet("Honey","brown");
		  System.out.println(ref3.name);
		  System.out.println(ref3.color);
		  System.out.println(ref3.price);
		  
		  Sweet ref4=new Sweet("Honey","brown",80);
		  System.out.println(ref4.name);
		  System.out.println(ref4.color);
		  System.out.println(ref4.price);
	  }
}
		  
		