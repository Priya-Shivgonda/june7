class  FireExtinguisherRunner{
	public static void main(String[] args)
	{
		System.out.println("FireExtinguisherRunner is main method");
		FireExtinguisher ref=new  FireExtinguisher();
		ref.printInstanceVariables();
		
		FireExtinguisher  ref1=new  FireExtinguisher("water","Potassium bicarbonate",5,30000,50);
		ref1.printInstanceVariables();
		System.out.println("updated variables");
		ref1.type="water";
		ref1.materials="chemical";
		ref1.noOfFireExtinguisher=7;
	    ref1.price=44000;
        ref1.weight=60;
		ref1.printInstanceVariables();
     }
   }

		