class  ScissorRunner{
   public static void main(String[] args)
   {
   System.out.println("Running main ...");
   
   Scissor ref1=new Scissor();
   System.out.println(ref1.brand);
   System.out.println(ref1.color);
   System.out.println(ref1.type);
   System.out.println(ref1.Usage);
   System.out.println(ref1.size);
   System.out.println(ref1.price);
   System.out.println(ref1.material);
   
   Scissor ref2=new Scissor("Global home");
   System.out.println(ref2.brand);
   System.out.println(ref2.color);
   System.out.println(ref2.type);
   System.out.println(ref2.usage);
   System.out.println(ref2.size);
   System.out.println(ref2.price);
   System.out.println(ref2.material);
   
   Scissor ref3=new  Scissor("Global home","red");
   System.out.println(ref3.brand);
   System.out.println(ref3.color);
   System.out.println(ref3.type);
   System.out.println(ref3.usage);
   System.out.println(ref3.size);
   System.out.println(ref3.price);
   System.out.println(ref3.material);
   
   Scissor ref4=new  Scissor("Global home","red","Stationery");
   System.out.println(ref4.brand);
   System.out.println(ref4.color);
   System.out.println(ref4.type);
   System.out.println(ref4.usage);
   System.out.println(ref4.size);
   System.out.println(ref4.price);
   System.out.println(ref4.material);
   
   Scissor ref5=new Scissor("Global home","red","Stationery","paper");
   System.out.println(ref5.brand);
   System.out.println(ref5.color);
   System.out.println(ref5.type);
   System.out.println(ref5.usage);
   System.out.println(ref5.size);
   System.out.println(ref5.price);
   System.out.println(ref5.material);
   
   Scissor ref6=new  Scissor("Global home","red","Stationery","paper",7);
   System.out.println(ref6.brand);
   System.out.println(ref6.color);
   System.out.println(ref6.type);
   System.out.println(ref6.usage);
   System.out.println(ref6.size);
   System.out.println(ref6.price);
   System.out.println(ref6.material);
   
   Scissor ref7=new Scissor("Global home","red","Stationery","paper",7,50,"thin paper");
   System.out.println(ref7.brand);
   System.out.println(ref7.color);
   System.out.println(ref7.type);
   System.out.println(ref7.usage);
   System.out.println(ref7.size);
   System.out.println(ref7.price);
   System.out.println(ref7.material);
   }
}