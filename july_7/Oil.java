class Oil{
        String brand;
	String type;
	int price;
	double quantity;
	String vehicleName;
   
	
	Oil()
	{
		System.out.println("constructor with no-arg");
	}
	
	Oil(String brand,String type,int price,double quantity,String vehicleName)
	{
		System.out.println("connstructor with arg String brand,String type,int price,double quantity,String vehicleName");
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.vehicleName=vehicleName;
	}
	 void  printInstanceVariables()
	 {
		 
		 System.out.println("oil brand:"+brand);
		 System.out.println("oil type:"+type);
		 System.out.println("oil price:"+price);
		 System.out.println("oil quantity:"+quantity);
		 System.out.println("vehicleName:"+vehicleName);
		 
	 }
}

	
	
