class Plate{
    String plateType;
	String color;
	int size;
	String  shape;
	int price;
	String material;
	int capacity;
	boolean broken;
	
	Plate( String plateType,String color,int size,String  shape,int price,String material,int capacity,boolean broken)
	{
		System.out.println("constructor with arg  String plateType,String color,int size,String  shape,int price,String material,int capacity,boolean broken ");
		this.plateType=plateType;
		this.color=color;
		this.size=size;
		this.shape=shape;
		this.price=price;
		this.material=material;
		this.capacity=capacity;
		this.broken=broken;
	}
}
