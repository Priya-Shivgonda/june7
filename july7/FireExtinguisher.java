class  FireExtinguisher{
	String type;
	String materials;
	int noOfFireExtinguisher;
	double price;
	double weight;
	
	
	FireExtinguisher()
	{
		System.out.println("constructor with no-arg");
	}
	  
	  
	FireExtinguisher(String types,String materials,int noOfFireExtinguisher,double price,double weight)
	{
		System.out.println("constructor with arg String type,String materials,int noOfFireExtinguisher,double price,double weight");	
		this.type=type;
		this.materials=materials;
		this.noOfFireExtinguisher=noOfFireExtinguisher;
		this.price=price;
		this.weight=weight;
	}
	
	void printInstanceVariables()
	{
		System.out.println("FireExtinguisher type:"+type);
		System.out.println("FireExtinguisher materials:"+materials);
		System.out.println("FireExtinguisher noOfFireExtinguisher:"+noOfFireExtinguisher);
        System.out.println("FireExtinguisher price:"+price);
		System.out.println("FireExtinguisher weight:"+weight);

}
}
	
	

	   
	
	 