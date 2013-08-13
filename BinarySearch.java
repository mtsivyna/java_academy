/**
 * BinarySearch.java
 * This class describe Iterative/Recursive binary search process in array
 * @version    1.1 08/13/13
 * @author     Maksym Tsivyna
 */
public class BinarySearch {

    /**
     * Current method is used for parsing input string,
     * identifying search value and array, print search result
     * @param args command line argument
     */
    public static void main(String[] args) {

        int[] array = new int[args.length-1];        // defining array
            int numberOfElements = args.length-1;    // number of elements in array

        // filling an array by elements of the entered args
        for (int elementId = 1; elementId <= numberOfElements; elementId++) {
            array[elementId - 1] = Integer.parseInt(args[elementId]);
        }
        System.out.println("Inserted array :");

            for (int element : array) {
                System.out.println(element + " ");
            }

        int searchVal = Integer.parseInt(args[0]);    // value that finding in array

        System.out.println("Recursive method: Element: " + searchVal + " is located on " +
                recursiveBinarySearch(array, searchVal) + " position");
        System.out.println("Iterative number: Element: " + searchVal + " is located on " +
                iterativeBinarySearch(array, searchVal) + " position");
    }

    /**
     * Current method is used for defining array element that equals search value using iterative method
     * @param array
     * @param searchVal
     * @return
     */
    public static int iterativeBinarySearch (int[] array, int searchVal) {

        int firstIndex = 0;                  // Index of first element
        int lastIndex = array.length - 1;    // Index of last element

        // finding value in array that equals searchVal
        while (firstIndex <= lastIndex) {
            int mid = firstIndex + (lastIndex - firstIndex) / 2;    // Index of mid value

            if (searchVal < array[mid]) {
                lastIndex = mid - 1;
            }

            else if (searchVal > array[mid]) {
                firstIndex = mid + 1;
            }

            else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Current method is used for defining array element that equals search value using recursive search method 
     * @param array
     * @param searchVal
     * @return
     */
    public static int recursiveBinarySearch(int[] array, int searchVal) {

        return recursiveBinarySearch (array, searchVal, 0, array.length - 1);
    }

    /**
     * @param array
     * @param searchVal
     * @param firstIndex - index of first element in array
     * @param lastIndex - index of last element in array
     * @return
     */
    public static int recursiveBinarySearch (int[] array, int searchVal, int firstIndex, int lastIndex) {

        // finding value in array that equals searchVal
        while (firstIndex <= lastIndex) {
            int mid = firstIndex + (lastIndex - firstIndex) / 2;    // Index of mid value

            if (searchVal > array[mid]) {
                return recursiveBinarySearch(array, searchVal, mid + 1, lastIndex);
            }

            else if (searchVal < array[mid]) {
                return recursiveBinarySearch(array, searchVal, firstIndex, mid - 1);
            }

            else {
                return mid;
            }
        }
        return -1;
    }
}
