class WorkerRunner{
   public static void main(String[] args)
   {
	   System.out.println("WorkerRunner is main method ");
	   Worker ref=new Worker();
       ref.printInstanceVariables()
	   
	   
	   Worker ref1=new Worker("Rahul",12000,1,4,"Cashier");
	   ref1.printInstanceVariables()
	   System.out.println("updated variables ");
	   ref1.name="Rohit";
	   ref1.salary=14000;
	   ref1.id=6;
	   ref1.experience=6;
	   ref1.position="accounting";
	   ref1.printInstanceVariables()
	   
   }
}
   
	   
	   
	   
	   