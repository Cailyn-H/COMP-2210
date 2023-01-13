package COMP2210;

public class MinOfThree {
	/**
     * Driver for the class.
     */
    public static void main(String[] args) {
        System.out.println(min1(3,1,2));
        System.out.println(min2(3,1,2));
    }

    /**
     * Returns the minimum values of its three parameters.
     *
     * @param a the first value
     * @param b the second value
     * @param c the third value
     * @return  the minimum of a, b, and c
     *
     */
    public static int min1(int a, int b, int c) {
        int min = a;
        
        if ((b < min) && (b < c)) { 
            min = b;
        }
        
        else if ((c < min)) {
            min = c;
        }
        return min;
    }

    /**
     * Returns the minimum values of its three parameters.
     *
     * @param a the first value
     * @param b the second value
     * @param c the third value
     * @return  the minimum of a, b, and c
     *
     */
    public static int min2(int a, int b, int c) {
        int min = a;
        if (min < b) {
            if (a < c) {
                min = a;
            } 
            else if (c < a) {
                min = c;
            } 
        }
        
        else if (b < c){
          
            min = b;
            
            if (c < b) {
                min = c;
            } 
         
        }
        else {
            min = c;
        }
        
        return min;
    }
}
