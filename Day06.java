import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Day06 {

	public static void main(String[] args) {
		Map<Integer, Map<Character, Integer>> chars = new TreeMap<>();
		Comparator<Entry<Character, Integer>> comparator = new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				if (o1.getValue().intValue() == o2.getValue().intValue()) {
					return o1.getKey().compareTo(o2.getKey());
				};
				return o2.getValue().compareTo(o1.getValue());
			}
		};

		for (int i = 0; i < 8; i++) {
			chars.put(i, new HashMap<>());
		}
		for (String str : inputs) {
			for (int i = 0; i < str.toCharArray().length; i++) {
				char ch = str.toCharArray()[i];
				chars.get(i).put(ch, chars.get(i).get(ch) != null ? chars.get(i).get(ch) + 1 : 1);
			}
		}

		for (Map<Character, Integer> ent : chars.values()) {
			List<Entry<Character, Integer>> list = new ArrayList<>(ent.entrySet());
			Collections.sort(list, comparator);
			System.out.print(list.get(0).getKey());
		}
		System.out.println();
		for (Map<Character, Integer> ent : chars.values()) {
			List<Entry<Character, Integer>> list = new ArrayList<>(ent.entrySet());
			Collections.sort(list, comparator.reversed());
			System.out.print(list.get(0).getKey());
		}
	}

	private static List<String> inputs;
	static {
		try {
			inputs = Files.readAllLines(Paths.get("6.txt"));
		} catch (IOException e) {}
	}

}
