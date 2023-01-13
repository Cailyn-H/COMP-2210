package COMP2210;

public class CountEvens {
//  C O M P L E T E   T H I S    M E T H O D 

    /**
     * Returns the number of even values in the paramter.
     */
    public static int countEvens(int[] values) {
        int count = 0;
        for (int i = 0;i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
