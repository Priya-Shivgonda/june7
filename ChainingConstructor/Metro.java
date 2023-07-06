class Metro{
  String line;
  double distance;
  String start;
  String destination;
  double capacity;
  Metro()
  {
    System.out.println("constructor with no-argument");
  }
  Metro(String line)
  {
    System.out.println("constructor with argument String line");
	this.line=line;
  }
  
  Metro(String line,double distance)
  {
    System.out.println("constructor with argument String line,double distance");
	this.line=line;
	this.distance=distance;
  }
  Metro(String line,double distance, String start)
  {
	  this(line,distance);
      System.out.println("constructor with argument String line,double distance");
	  this.start=start;
  }
   Metro(String line,double distance, String start,String destination)
  {
	  this(line,distance,start);
      System.out.println("constructor with argument String line,double distance,String destination");
	  this.destination=destination;
  }
   Metro(String line,double distance, String start,String destination,double capacity)
  {
	  this(line,distance,start,destination);
      System.out.println("constructor with argument String line,double distance,String start,String destination,double capacity");
	  this.capacity=capacity;
  }
  
}