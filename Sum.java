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
	int j;		// Number of values
        
	    for (j = 0; j < args.length; j++) {
		String[] element = args[j].split(" ");
		
		    for (int i = 0; i < element.length; i++) {
			int a = Integer.parseInt(element[i]);
			sum += a;
		    }
	    }
	System.out.println("You've entered: " + j + " elemnt(s)" + "\nSum = " + sum);
    }
}
