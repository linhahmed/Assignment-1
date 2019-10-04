import java.util.*;
import java.util.ArrayList;

public class Operations {
	static ArrayList<String> Union(String[] first, String[] second) {
		ArrayList<String> U = new ArrayList();
		for (int i = 0; i < first.length; i++) {
			if (first[i] != null) {
				U.add(first[i]);
			} else if (first[i] == null) {
				if (second[i] != null) {
					U.add(second[i]);
				} else {
					continue;
				}
			}
		}
		return U;
	}

	static ArrayList<String> Intersection(String[] first, String[] second) {
		ArrayList<String> I = new ArrayList();
		for (int i = 0; i < first.length; i++) {
			if (first[i] == null || second[i] == null) {
				continue;
			}
			if (first[i].equals(second[i])) {
				I.add(first[i]);
			}
		}
		if (I.isEmpty()) {
			System.out.println("Φ");
			I.add(" ");
		}
		return I;
	}

	static ArrayList<String> Compliment(String[] first, String[] second) {
		ArrayList<String> C = new ArrayList();
		int count = 0;
		for (int i = 0; i < first.length; i++) {
			if (second[i] == null) {
				C.add(first[i]);
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("Φ");
			C.add(" ");
		}
		return C;
	}

}
