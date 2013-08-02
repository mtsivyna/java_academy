public class Sum {
    public static void main(String [] args) {
        int sum3 = 0;
        int sum2 = 0;
        int sum1 = 0;
        if (args.length==0) {
            System.out.println("Please set value");
        } else {
			String[] arr1 = args[0].split(" ");
            String[] strArray1 = new String[]{args[0]};

            for (int i = 0; i < arr1.length; i++) {
                int a = Integer.parseInt(arr1[i]);
                sum1 += a;
            }
        }
        if (args.length<=1) {
        } else {
            String[] arr2 = args[1].split(" ");
            String[] strArray2 = new String[]{args[1]};

            for (int i = 0; i < arr2.length; i++) {
                int a = Integer.parseInt(arr2[i]);
                sum2 += a;
            }
		}			
        if (args.length<=2) {
		System.out.println("WTF");
        } else {
            String[] arr3 = args[2].split(" ");
            String[] strArray3 = new String[]{args[2]};
			
            for (int i = 0; i < arr3.length; i++) {
                int a = Integer.parseInt(arr3[i]);
                sum3 += a;
            }
		}
		
        int finalSum = sum1 + sum2 + sum3;
        System.out.println("final: "+finalSum);
    }
}