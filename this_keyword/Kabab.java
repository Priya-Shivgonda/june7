class Kabab{
   String  name="Chicken Kabab";
   double price;
   String hotelName="Bawarchi Hotel";
   int noOfPieces;
   boolean takeAway;
   Kabab()
   {
	   System.out.println("Constructor 1");
   }
   
   Kabab(String name)
   {
	   System.out.println("Constructor 2");
	   this.name=name;
   }
       
   Kabab(String name,double price,String hotelName)
    {
 	   System.out.println("Constructor 3");
	   this.name=name;
	   this.price=price;
	   this.hotelName=hotelName;
	   
    }
	 Kabab(String name,double price,String hotelName,int noOfPieces)
    {
 	   System.out.println("Constructor 4");
	   this.name=name;
	   this.price=price;
	   this.hotelName=hotelName;
	   this.noOfPieces=noOfPieces;
	   
    }
     Kabab(String name,double price,String hotelName,int noOfPieces,boolean takeAway)
    {
 	   System.out.println("Constructor 4");
	   this.name=name;
	   this.price=price;
	   this.hotelName=hotelName;
	   this.noOfPieces=noOfPieces;
	   this. takeAway= takeAway;
    }
}