// LinkedHashSet keeps the insertion order

package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramLinkedHashSet {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Printer");
		set.add("Scanner");
		
		
		set.remove("Tablet");
		set.removeIf(x -> x.length() >= 8);
		set.removeIf(x -> x.charAt(0) == 'T');


		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
