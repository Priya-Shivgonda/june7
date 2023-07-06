class MetroRunner{
  public static void main(String[] args)
  {
	  System.out.println("metroRunner is main method");
	  Metro ref=new Metro("red",20,"Banashankari","Btm",2000);
	  System.out.println(ref.line);
	  System.out.println(ref.distance);
	  System.out.println(ref.start);
	  System.out.println(ref.destination);
	  System.out.println(ref.capacity);
	  
  }
}