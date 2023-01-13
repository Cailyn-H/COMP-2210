package COMP2210;
import java.util.*;

public class CountPositives {
	public static int countPositives(Collection<Integer> collection) {
		int count = 0, num;
		Iterator<Integer> itr = collection.iterator();
		
		while (itr.hasNext()) {
			num = itr.next();
			if (num > 0) {
				count++;
			}
		}
		return count;
	}
}
