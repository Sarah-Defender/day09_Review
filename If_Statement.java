package Day09_Review;

public class If_Statement {

	/*
	 If statements: 
	       <1> single if statement: starts with if, then it takes boolean expression==>
	                                                 ==>  if(boolean expression){some codes to run}
	                                                 if block only get executed if the condition is true
	 
	 
	 
	 
	 */
	
	    public static void main(String[] args) {
		 
	    	if(true) {
	    	System.out.println("Hello");
	    	System.out.println("Happy Friday");
	    	System.out.println("Tomorrow is a day off");
	    	}
	    	
	    	if(9>10) {
		    	System.out.println("Hello");
		    	System.out.println("Happy Friday");
		    	System.out.println("Tomorrow is a day off");
		    	System.out.println("Class starts on Monday");
	    	}// this didn't get execute because boolean expression is not true
	    	
	    	int a=1000;
	    	if(a++ == 1000) { // if a++ = 1001 here, it won't execute the code
	    		a=2000;
	    		System.out.println("a is increased");
	    	    }
	    	System.out.println("\n");
	    	
	    	
	    	int X=987654320;
	    	
	    	if(X%2== 0 ) {
	    		System.out.println(X);
	    		System.out.println("it is an even number");
	    	}
	    	
	    	if (X%2 != 0) {
	    		System.out.println(X);
	    		System.out.println("it is an even number");
	    	}
	    	System.out.println("\n");
	    	
	    	
	    	int Y=2345678;
	    	if(Y%5 == 0) {
	    		System.out.println(Y+" can be divided by 5 as a whole number ");
	    	}
	    	 
	    	if (Y%5 != 0) {
	    		System.out.println(Y+" can't be divided by 5 as a whole number");
	    	}
	    	
	    	String CEO = "Main Boss";
	    	String Kuzzat = "Main Boss";
	    	
	    	System.out.println(CEO == Kuzzat);//true
	    	
	    	if(Kuzzat == CEO) {
	    		System.out.println("great person in the world");
	    }
	    	
	    
	    	/*
	    	 1. declare a variable, and initialize user age
	    	 2. write a program if the user is eligible to vote for Donald Trum
	    	       vote age:18
	    	 */
	    	byte PersonSage=78; 
	    	byte voteAge=18;
	    	 
	    	if(PersonSage >= voteAge) {
	    		System.out.println("\nyes you are eligible to vote");
	    	    System.out.println("have fun with building the wall");
	    	    System.out.println("MAGA");
	    	}
	    	 if(PersonSage < voteAge) {
	    		 System.out.println("you are not eligible to vote yet, please come back after you grow up");
	    	 }
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	}
	
}
