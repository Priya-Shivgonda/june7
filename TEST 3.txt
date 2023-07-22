JAVA TEST

1.Syntax error
2.Compilation error
3.50
4. length 4
   sum of the values 200

5.method parameters:
     method parameters are variables declared within the parentheses of a method's signature.
	 It is allow to pass the data or values to a method.
	 public return_type methodName(parameter1,parameter2.........)
	 {
	 // Method body
	 }
	 
6.  Compile time polymorphism is achieved through method overloading and method overring.
     
	 polymorphism:
	  polymorphism is defined as multiple methods with the same name but different parameters list based on the example.
	  
 Ex:
      public class Sum{
	    int add(int a,int b){
		return a+b;
		double add(double a,double b){
		return a+b;
		}
		
		}
		
		public class SumRunner{
			public static void main(String[] args)
			{
				Sum sum=new Sum();
				
				  int  sumIntegers=new  sumIntegers();
				  int  sumdouble=new  sumdouble();
		  
                 System.out.println("sum of intergers:"+sumIntegers);
				 System.out.println("sum of double :"+sumdouble);
			}
		}
				 

9  package :
      package is a  mechanism used organize and group related classes and interfaces together.
      package  com.xworkz.myapp.maypackage;

import:
  import is a package is used to bring classes,interfaces or other types from one package into the current filrs scope.
  
  import package.name.ClassName;
  
  two types of import 
  1.single type import
  2.wild- card import.
  
  1.single type import
      single type import allows to import a specific class or interface from a package into a current file scope.
	  
	  
	  Syntax:
	    import package.name.ClassName;
		
  2.wild- card import.
    Wildcard import allows you to import all the classes and interfaces within a package into your current file's scope.
    Systax:
	
	import packge.*;
	
 10. Constructor chaining;
      Constructor chaining is defined as one constructor is called  from another constructors is called constructor chaining.
	  
	  Syntax:
	     constructorName(parameter1)
		 {
		 //body
		 }
		 
		 constructor chaining is achieved using this() and super() keywords
		 
		 Ex:
		    public class Train{
				int trainNum;
				int ticket;
				
				Train()
				{
					System.out.println("no-arg constructor");
					
				}
				
		 Train(int trainNum,int ticket)
				{
					System.out.println("with-arg constructor");
					this.trainNum=trainNum;
					this.ticket=ticket;
				}
					
				}
				
		Super  chaing :
		
		  class Animal{
			  String name;
			  
			  
			  Animal(String name)
			  {
				  this.name=name;
			  }
		  }
		  
		  public class Dog extends to Animal {
			  String bread;
			  
			  public Dog(String name,String bread)
			  {
				  super(name);
				  this.braed=bread;
			  }
		  }
		  
11. 

public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Fibonacci Sequence up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


12.check  if a list of integers contains only odd numbers in java because 
 we can iterate through each element of the list and use the modulo operator(%) to determine if it's odd.
 
13.

public class ArrayEqualityChecker {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 2, 4, 1, 3}; 

        boolean areEqual = checkArraysEquality(array1, array2);
        System.out.println("The two arrays are equal: " + areEqual);
    }

    public static boolean checkArraysEquality(int[] arr1, int[] arr2) {
        
        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true; 
    }
}


14.enumerations:
     enum is a special  data type that  defines a set of named constants,representing a fixed set of values.
	 
	 It is used to represent a group of related constants.
	 Enumerations are defined using the enum keyword.

	 Syantax:
	 enum DayOfWeek{
		 SUNDAY,MONDAY, ,WEDNESDAY, THURSDAY, FRIDAY,SATURDAY;
}


public class EnumExample {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;

        if (today == DayOfWeek.WEDNESDAY) {
            System.out.println("It's Wednesday!");
        } else {
            System.out.println("It's not Wednesday.");
        }
    }
}

15. when we call  object in inside the jvm  it will load the clases ,memort allocation,initialization ,object creation,garbage collection.


16  1. Fields
     2.  Methods
	 3.  constructors
	 4.  static fields
	 5.  static methods
     6.  nested classes
     7.  inner  interfaces
     8.   Annotations
	 

