/**
 * BinarySearch.java
 * This class describe Iterative/Recursive binary search process in array
 * @version    1.0 08/11/13
 * @author    Maksym Tsivyna
 */

public class BinarySearch{
	/**
	Current method is used for parsing input string,
	identification values, display search result */
	
    public static void main(String[] args) {
		
        int[] array = new int[args.length-1];    // array length = args length - 1 
		int numberOfElements = array.length;     // number of elements in array

        for (int elementId = 1; elementId <= numberOfElements; elementId++) {
            array[elementId - 1] = Integer.parseInt(args[elementId]);
        }
        System.out.println("Inserted array :");

            for (int element : array){
                System.out.println(element + " ");
            }

        int searchVal = Integer.parseInt(args[0]);    // value that should be found in array

        System.out.println("Recursive method: Element: " + searchVal + " is located on " +
                recursiveBinarySearch(array, searchVal) + " position");
        System.out.println("Iterative number: Element: " + searchVal + " is located on " +
                iterativeBinarySearch(array, searchVal) + " position");
    }
	
	/**
	Current method is used for defining array element that equals search value
	using iterative method	*/
	
    public static int iterativeBinarySearch (int[] array, int searchVal) {

        int firstIndex = 0;    				 // Index of first element
        int lastIndex = array.length - 1;    // Index of last element

        while (firstIndex <= lastIndex) {
            int mid = firstIndex + (lastIndex - firstIndex) / 2;	// Index of mid value

            if (searchVal < array[mid])
                lastIndex = --mid;

            else if(searchVal > array[mid])
                firstIndex = ++mid;

            else
                return mid;
        }
        return -1;
    }
	
	/**
	Current methods are used for defining array element that equals search value 
	using recursive search method*/
	
    public static int recursiveBinarySearch(int[] array, int searchVal) {

        return recursiveBinarySearch (array, searchVal, 0, array.length - 1);
    }
	
    public static int recursiveBinarySearch (int[] array, int searchVal, int firstIndex, int lastIndex){

        while (firstIndex <= lastIndex){
            int mid = firstIndex + (lastIndex - firstIndex) / 2;	// Index of mid value

            if(searchVal > array[mid])
                return recursiveBinarySearch(array, searchVal, ++mid, lastIndex);

            else if(searchVal < array[mid])
                return recursiveBinarySearch(array, searchVal, firstIndex, --mid);

            else
                return mid;
        }
        return -1;
    }
}
