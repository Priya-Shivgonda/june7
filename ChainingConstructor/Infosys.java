class Infosys{
	String founderName;
	String founderWifeName;
	double founded;
	double totalEmployees;
	Infosys()
	{
		System.out.println("constructor with no-argument");
	}
	
	Infosys(String founderName)
	{
		System.out.println("constructor with arg is String founderName ");
		this.founderName=founderName;
	}
	Infosys(String founderName,String founderWifeName )
	{
		System.out.println("constructor with arg is running String founderName,String founderWifeName");
		this.founderName=founderName;
		this.founderWifeName=founderWifeName;
	}
	Infosys(String founderName,String founderWifeName ,double founded)
	{
	    this(founderName,founderWifeName);
		System.out.println("constructor with arg is running String founderName,String founderWifeName,double founded");
		this.founded=founded;
	}
	
	Infosys(String founderName,String founderWifeName ,double founded,double totalEmployees)
	{
	    this(founderName,founderWifeName,founded);
		System.out.println("constructor with arg is running String founderName,String founderWifeName,double founded,double totalEmployee");
		this.totalEmployees=totalEmployees;
	}
}
	