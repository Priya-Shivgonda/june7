class Pot{
   String color;
   int  size;
   String shape;
   double price;
   int capacity;
   String material;
   String use ;
   int durability;
   
   
   Pot(String color,int size,String shape,double price,int capacity,String material,String use,int durability)
   {
	   System.out.println("constructor with arg String color,int size,String shape,double price,int capacity,String  material,String use,int durability");
	   this.color=color;
       this.size=size;
       this.shape=shape;
       this.price=price;
       this.capacity=capacity;
       this.material=material;
	   this.use=use;
	   this.durability=durability;
   }
}