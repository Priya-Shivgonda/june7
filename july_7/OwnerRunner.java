class OwnerRunner{
    public static void main(String[] args)
	{
	  System.out.println("OwnerRunner is main method");
	  Owner ref = new Owner();
	  ref.printInstanceVariables();
	  
	  Owner ref1=new Owner("Akash",30,"Bangalore",911081055,30000);
	  ref1.printInstanceVariables();
	  System.out.println("updates variables");
          ref1.name="Lokesh";	  
          ref1.age=25;	  
          ref1.address="Bidar";
          ref1.phoneNumber=889754360; 
          ref1.income=20000;  
	  ref1.printInstanceVariables(); 
	}
}
