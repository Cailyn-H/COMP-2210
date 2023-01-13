package COMP2210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorError {
	/**
     * Identify and eliminate the errors regarding the use
     * of the iterator itr in the following method.
     */
    public static <T> int search(List<T> list, T target) {
        int i = 0;
        
        for(T element: list) {
            if (list.get(i).equals(target)) {
                return i;
            }
            i++;
        }
        return -1;
        
    }
    
    /*public static <T> int search(List<T> list, T target) {
        int i = 0;
        Iterator<T> itr = list.iterator();
        T val = null;
        
        for(T element: list) {
            val = itr.next();
            if (val.equals(target)) {
                return i; 
            }
            i++;
        }
        return -1;*/

    /** Drives execution. */
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<Integer>();
        ilist.add(2);
        ilist.add(4);
        ilist.add(6);
        ilist.add(8);
        ilist.add(10);

        int loc = IteratorError.<Integer>search(ilist, 8);
        System.out.println(loc);
        loc = IteratorError.<Integer>search(ilist, 5);
        System.out.println(loc);
    }

}
