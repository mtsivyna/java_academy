public class Sum {
    public static void main(String [] args) {
        int sum = 0;
		for (int j = 0; j <= args.length; j++){
			if (args.length<=j) {
				System.out.println("You've entered: "+j+" element(s)");
			} else {
				String[] arr1 = args[j].split(" ");
				String[] strArray1 = new String[]{args[j]};
				for (int i = 0; i < arr1.length; i++) {
					int a = Integer.parseInt(arr1[i]);
					sum += a;
				}
			}
		}
	        System.out.println("Sum: "+sum);
	}
}
