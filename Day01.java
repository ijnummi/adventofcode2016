import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day01 {

	public static void main(String[] args) {
		int dir = 0, x = 0, y = 0;
		Set<String> places = new HashSet<>();
		boolean first = false;
		for (String str : inputs) {
			dir = (360 + dir + (str.startsWith("L") ? -90 : 90)) % 360;
			int dist = Integer.valueOf(str.substring(1));
			for (int i = 0; i < dist; i++) {
				if (dir == 0) y++;
				if (dir == 90) x++;
				if (dir == 180) y--;
				if (dir == 270) x--;
				if (!first && places.contains(x + "/" + y)) {
					System.out.println("Part2: " + (Math.abs(x) + Math.abs(y)));
					first = true;
				}
				places.add(x + "/" + y);
			}
		}
		System.out.println("Part1: " + (Math.abs(x) + Math.abs(y)));
	}

	private static List<String> inputs = Arrays.asList(("L1, L3, L5, L3, R1, L4, L5, R1, R3, L5, R1, L3, L2, L3, R2, R2, L3, L3, R1,"
		+ " L2, R1, L3, L2, R4, R2, L5, R4, L5, R4, L2, R3, L2, R4, R1, L5, L4, R1, L2, R3, R1, R2, L4, R1, L2, R3, L2, L3, R5,"
		+ " L192, R4, L5, R4, L1, R4, L4, R2, L5, R45, L2, L5, R4, R5, L3, R5, R77, R2, R5, L5, R1, R4, L4, L4, R2, L4, L1, R191,"
		+ " R1, L1, L2, L2, L4, L3, R1, L3, R1, R5, R3, L1, L4, L2, L3, L1, L1, R5, L4, R1, L3, R1, L2, R1, R4, R5, L4, L2, R4,"
		+ " R5, L1, L2, R3, L4, R2, R2, R3, L2, L3, L5, R3, R1, L4, L3, R4, R2, R2, R2, R1, L4, R4, R1, R2, R1, L2, L2, R4, L1,"
		+ " L2, R3, L3, L5, L4, R4, L3, L1, L5, L3, L5, R5, L5, L4, L2, R1, L2, L4, L2, L4, L1, R4, R4, R5, R1, L4, R2, L4, L2,"
		+ " L4, R2, L4, L1, L2, R1, R4, R3, R2, R2, R5, L1, L2")
		.split(", "));

}
