/**
* Sum.java
* This class outputs the sum of input values
* @version    1.3 08/05/13
* @author    Maksym Tsivyna 
*/

public class Sum {
	
    public static void main(String [] args) {
        int sum = 0;
        int j;
        
	    for (j = 0; j < args.length; j++) {
		String[] arr1 = args[j].split(" ");
		
		    for (int i = 0; i < arr1.length; i++) {
			int a = Integer.parseInt(arr1[i]);
			sum += a;
		    }
	    }
	        System.out.println("You've entered: "+j+" elemnt(s)"+"\nSum = "+sum);
    }
}
