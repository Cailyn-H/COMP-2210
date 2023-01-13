package COMP2210;
import java.util.*;

public class HeadSet {
	public static <T> Collection<T> headSet(Collection<T> set, T toElement, Comparator<T> order){
		Collection<T> result = new ArrayList<T>();
		Iterator<T> itr = set.iterator();
		
		T val = null;
		while (itr.hasNext()) {
			val = itr.next();
			if (order.compare(val, toElement) < 0) {
				result.add(val);
			}
		}
		return result;
	}
}
