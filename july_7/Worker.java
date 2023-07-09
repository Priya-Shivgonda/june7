class  Worker{
	String name;
	double salary;
	int id;
	int experience;
	String position;
	
    Worker()
	{
		System.out.println("constructor with no-arg");
	}
	
	Worker(String name,double salary,int id,int experience,String position)
	{
		System.out.println("constructor with arg String name,double salary,int id,int experience,String position");
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.experience=experience;
		this.position=position;
   }
   
   void printInstanceVariables()
   {
	    System.out.println("worker name:"+name);
		System.out.println("worker salary:"+salary);
		System.out.println("worker id:"+id);
		System.out.println("worker experience:"+experience);
		System.out.println("worker position:"+position);
   }
}   
