package COMP2210;

public class CountNegatives {
	/**
     * Returns the number of negative values in the given array.
     */
    
    public static int countNegatives(int[]b) {
        int count = 0;
        
        for (int i = 0; i<b.length; i++) {
            if (b[i] < 0 ) {
                count ++;
            }
        }
        return count;
    }

}
