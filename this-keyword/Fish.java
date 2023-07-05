class Fish{
   String  name="Shark";
   String type;
   double price;
   String location;
 
   Fish()
   {
	   System.out.println("Constructor 1 with no parameters");
   }
   
   Fish(String name)
   {
	   System.out.println("Constructor 2 with 1 parameter String name");
	   this.name=name;
   }
       
   Fish(String name,String type,double price)
    {
 	   System.out.println("Constructor 3 with parameter String name, double price");
	   this.name=name;
	   this.type=type;
	   this.price=price;
	   
    }
	Fish(String name,String type,double price,String location)
    {
 	   System.out.println("Constructor 3  running with 3 parameter String name,String type,double price");
	   this.name=name;
	   this.type=type;
	   this.price=price;
	   this.location=location;	   
    }
}