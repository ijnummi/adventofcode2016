import java.util.Arrays;

public class Day05 {

	public static void main(String[] args) throws java.security.NoSuchAlgorithmException {
		int count = 0;
		for (int i = 0; count < 8; i++) {
			byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(("ffykfhsq" + i).getBytes());
			if (digest[0] == 0 && digest[1] == 0 && digest[2] >> 4 == 0) {
				System.out.print(Integer.toHexString(digest[2] << 4 >> 4));
				count++;
			}
		}
		System.out.println();
		count = 0;
		Character[] pass = { null, null, null, null, null, null, null, null };
		for (int i = 0; Arrays.asList(pass).contains(null); i++) {
			byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(("ffykfhsq" + i).getBytes());
			if (digest[0] == 0 && digest[1] == 0 && digest[2] >> 4 == 0) {
				int pos = digest[2] << 4 >> 4;
				if (pos < 8 && pass[pos] == null) {
					pass[pos] = Integer.toHexString((digest[3] & 0xf0)).toCharArray()[0];
				}
			}
		}
		System.out.println(Arrays.toString(pass).replaceAll(", ", ""));
	}

}
