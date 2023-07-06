class MoneyRunner{
  public  static void main(String[] args)
  {
	  System.out.println("MoneyRunner is main method");
	  Money ref=new Money("USA","dollar","$", "Cash");
	  System.out.println(ref.country);
	  System.out.println(ref.currency);
	  System.out.println(ref.denomination);
	  System.out.println(ref.type);
  }
}