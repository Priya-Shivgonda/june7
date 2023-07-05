class Scissor{
   String brand;
   String color="red";
   String type="Stationery scissor";
   String usage;
   char size;
   double price=50;
   String   material;
   Scissor()
   {
	   System.out.println("constructor with no parameter");
   }
   
   Scissor(String brand)
    {
	   System.out.println("constructor with  parameter String brand");
	   this.brand=brand;
   }
   
   Scissor(String brand,String color)
    {
	   System.out.println("constructor with  parameter String brand,String color");
	   this.brand=brand;
	   this.color=color;
   }
   Scissor(String brand,String color,String type)
    {
	   System.out.println("constructor with  parameter String brand,String color,String type");
	   this.brand=brand;
	   this.color=color;
	   this.type=type;
   }
   Scissor(String brand,String color,String type,String uage)
    {
	   System.out.println("constructor with  parameter String brand,String color,String type,String usage");
	   this.brand=brand;
	   this.color=color;
	   this.type=type;
	   this.usage=usage;
   }
   
    Scissor(String brand,String color,String type,String uage,char size)
    {
	   System.out.println("constructor with  parameter String brand,String color,String type,String usage,char size");
	   this.brand=brand;
	   this.color=color;
	   this.type=type;
	   this.usage=usage;
	   this.size=size;
   }
   Scissor(String brand,String color,String type,String usage,char size,double price,String material)
    {
	   System.out.println("constructor with  parameter String brand,String color,String type,String usage,char size,double price, String material");
	   this.brand=brand;
	   this.color=color;
	   this.type=type;
	   this.usage=usage;
	   this.size=size;
	   this.price=price;
	   this.material=material;
   }
}
   
