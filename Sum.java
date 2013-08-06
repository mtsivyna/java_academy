/**
* Sum.java
* This class describe summation process of input values
* @version    1.3 08/05/13
* @author    Maksym Tsivyna 
*/

public class Sum {
    /**
      Current method is used for parsing input string
      identification values, summation operation and display result */
     
    public static void main(String [] args) {
        int sum = 0;	// Result sum value
        
        for (String arg : args) {
	    String[] element = arg.split(" ");
		
	    for (String value : element) {
	        int a = Integer.parseInt(value);
		sum += a;
	    }
        }
    System.out.println("Sum = " + sum);
    }
}
