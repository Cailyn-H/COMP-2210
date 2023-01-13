package COMP2210;

public class CountOdds_LabTest1 {
	 public static int countOdds(int[] values) {
	        int count = 0;
	        for (int i = 0;i < values.length; i++) {
	            if (values[i] % 2 != 0) {
	                count++;
	            }
	        }
	        return count;
	    }
}
