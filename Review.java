package Day09_Review;

public class Review {
         /*
          > : greater 
          >= : greater than or equal, return you true as long as one of them qualify
          <: less than 
          <=: less than or equal,either less or equal will make it true           
          ==:equal , will give you true result only when its equal 
          !=: not equal 
          &&: and logic, true if both statements are true
          ||: or logic, true if one in two statement is true
          */ 
      
	
	  public static void main(String[] args) {
		  System.out.println('Z'>'A'); // true according to ascii table
		  System.out.println('Z'>='A');// true
		  System.out.println('a'<'A'); // false 
		  System.out.println('A'<='A');//true
		  System.out.println('A'<='a');// true
		 System.out.println(false==false);// true
		 System.out.println(false !=true);// true
		 
		 byte X=10;int Y=10;
		 System.out.println(X==Y);//true; for primitives, yes
		 
		 //&&:
		 System.out.println(true==true && false != true);//true
		 
		// ||:
			System.out.println(true != true || false==true  ); //false
			System.out.println(true==true || false == true); // true
				 
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
