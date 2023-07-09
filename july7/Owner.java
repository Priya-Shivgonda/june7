class Owner{
   String name;
   int age;
   String address;
   long phoneNumber;
   int income;
   
   Owner()
   {
	   System.out.println("constructor with no-arg");
   }
   
   Owner(String name,int age,String address,long phoneNumber,int income)
  
   {
	   System.out.println("constructor with arg String name,int age,String address,long phoneNumber,int income");
	   this.name=name;
	   this.age=age;
	   this.address=address;
	   this.phoneNumber=phoneNumber;
	   this.income=income;
   }
   void printInstanceVariables()
   {
	   System.out.println("Owner name:"+name);
	   System.out.println("Owner age:"+age);
	   System.out.println("Owner address:"+address);
	   System.out.println("Owner phoneNumber:"+phoneNumber);
	   System.out.println("Owner income:"+income);
	   
}
}
   
   
   