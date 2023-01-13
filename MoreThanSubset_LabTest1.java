package COMP2210;

import java.util.ArrayList;
import java.util.Collection;

public class MoreThanSubset_LabTest1 {
	 public static <T extends Comparable<T>> Collection<T> moreThanSubset(Collection<T> collection, T value) {
         ArrayList<T> result = new ArrayList<>();
         
         for (T val : collection) {
         	if(val.compareTo(value) > 0) { 

         		result.add(val);
         	}
         	
         }
         return result;
			
 	}
}
