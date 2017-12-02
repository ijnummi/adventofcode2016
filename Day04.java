import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day04 {

	public static void main(String[] args) {
		int count = 0;
		for (String str : inputs) {
			Day04 day = new Day04(str);
			if (day.check()) {
				count += day.id;
				System.out.println(day.name + " - " + day.id);
			}
		}
		System.out.print(count);
	}

	private static List<String> inputs = null;
	private static Pattern pat;

	private String key;
	private String check;
	private String verify;
	private Integer id;
	private String name = "";

	public Day04(String str) {
		Matcher match = pat.matcher(str);
		match.find();
		key = match.group(1);
		id = Integer.valueOf(match.group(2));
		check = match.group(3);
	}

	private boolean check() {
		Map<Character, Integer> counts = new TreeMap<>();
		Comparator<Entry<Character, Integer>> comparator = new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				if (o1.getValue().intValue() == o2.getValue().intValue()) {
					return o1.getKey().compareTo(o2.getKey());
				};
				return o2.getValue().compareTo(o1.getValue());
			}
		};
		for (char ch : key.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				counts.put(ch, counts.get(ch) != null ? counts.get(ch) + 1 : 1);
				this.name += Character.valueOf((char) (((ch - 'a' + id) % 26) + 'a'));
			}
			else if (ch == '-') {
				this.name += " ";
			}
		}
		List<Entry<Character, Integer>> list = new ArrayList<>(counts.entrySet());
		Collections.sort(list, comparator);

		verify = "";
		for (int i = 0; i < 5; i++) {
			verify += list.get(i).getKey();
		}
		return verify.equals(check);
	}

	static {
		pat = Pattern.compile("(.*)\\-(.*)\\[(.*)\\]");
		try {
			inputs = Files.readAllLines(Paths.get("4.txt"));
		} catch (IOException e) {}
	}

}
