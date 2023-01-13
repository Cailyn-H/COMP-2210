package COMP2210;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class LessThanSubset {
	// C O M P L E T E   T H I S   M E T H O D 

    /**
     * Returns the elements in collection strictly less than value.
     */
    public static <T extends Comparable<T>> Collection<T> lessThanSubset(Collection<T> collection, T value) {
            ArrayList<T> result = new ArrayList<>();
            
            for (T k : collection) {
            	if(k.compareTo(value) < 0) { 

            		result.add(k);
            	}
            	
            }
            return result;
			
    	}
}
    
    
