class Sofa{
	String  brand;
	String  color;
	double price;
	String  design;
	int   capacity;
	String  material="Fabric";
	long length=10;
	String  quality="good";
	
	Sofa(String brand,String color,double price,String  design,int capacity,String material,long length,String  quality )
	{
		System.out.println("Constructor with arg String brand,String color,double price,String  design,int capacity,String  material,long length,String  quality ");
	     this.brand=brand;
		 this.color=color;
		 this.price=price;	
		 this.design=design;
	     this.capacity=capacity;
	     this.material=material;
	     this.length=length;
         this.quality=quality;
	}
}