// Set is an interface
// HashSet, TreeSet, LinkedHashSet
// add, remove, contains
// size, clear, remove (predicate)
// addAll (union), retainAll (intersection), removeAll (difference)

// HashSet places in no order


package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramHashSet {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
