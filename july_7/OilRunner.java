class OilRunner{
    public static void main(String[] args)
	{
	  System.out.println("OilRunner is main method");
	  Oil  ref = new Oil ();
	  ref.printInstanceVariables();
	  
	  Oil ref1=new Oil ("Bharat petroleum","petrol",120,3,"Bike");
	  ref1.printInstanceVariables();
	  
	  System.out.println("updated variables");
	  ref1.brand="Hindustan Petroleum";
	  ref1.type="diesel";
	  ref1.price=200;
	  ref1.quantity=4;
	  ref1.vehicleName="Car";
	  ref1.printInstanceVariables();
}
}