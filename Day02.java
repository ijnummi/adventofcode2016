public class Day02 {

	public static void main(String[] args) {
		for (String str : inputs) {
			int key = 5;
			for (char ch : str.toCharArray()) {
				if (ch == 'L' && ((key + 3) % 3 == 2)) key--;
				else if (ch == 'L' && ((key + 3) % 3 == 0)) key--;
				else if (ch == 'R' && ((key + 3) % 3 == 1)) key++;
				else if (ch == 'R' && ((key + 3) % 3 == 2)) key++;
				else if (ch == 'U' && key >= 4) key -= 3;
				else if (ch == 'D' && key <= 6) key += 3;
				//System.out.println(ch + " - " + key);
			}
			System.out.print(key);
		}
		System.out.println();
		for (String str : inputs) {
			char key = '5';
			for (char ch : str.toCharArray()) {
				if (ch == 'L') {
					if (key == '4') key = '3';
					else if (key == '3') key = '2';
					else if (key == '9') key = '8';
					else if (key == '8') key = '7';
					else if (key == '7') key = '6';
					else if (key == '6') key = '5';
					else if (key == 'C') key = 'B';
					else if (key == 'B') key = 'A';
				}
				else if (ch == 'R') {
					if (key == '3') key = '4';
					else if (key == '2') key = '3';
					else if (key == '8') key = '9';
					else if (key == '7') key = '8';
					else if (key == '6') key = '7';
					else if (key == '5') key = '6';
					else if (key == 'B') key = 'C';
					else if (key == 'A') key = 'B';
				}
				else if (ch == 'U') {
					if (key == 'A') key = '6';
					else if (key == '6') key = '2';
					else if (key == 'D') key = 'B';
					else if (key == 'B') key = '7';
					else if (key == '7') key = '3';
					else if (key == '3') key = '1';
					else if (key == 'C') key = '8';
					else if (key == '8') key = '4';
				}
				else if (ch == 'D') {
					if (key == '6') key = 'A';
					else if (key == '2') key = '6';
					else if (key == 'B') key = 'D';
					else if (key == '7') key = 'B';
					else if (key == '3') key = '7';
					else if (key == '1') key = '3';
					else if (key == '8') key = 'C';
					else if (key == '4') key = '8';
				}
				//System.out.println(ch + " - " + key);
			}
			System.out.print(key);
		}
	}

	private static String[] inputs = {
		"LLLUDRDLLULDUDLLRLUDURULDURRRRLLURLDLDDDULLDDUDLRDLRDUURRDUUDLLRUUDDLULURDLRDUUDUDRURULLLLDRULDDLRDDRDLRDDLURLDDUDLLUUDLRDDDDLULUUURRDLUUDDLULLURRRDULLUDUDRDRDDRLDLLRLRDDDRDLULLUULDLLLRRDDUURUURDLLDRRDDLRULDLLDRLLUDRRDLUUULDLURLLDDURRUULLLLLRLUDLDDLLLURRRDUDULRULULDDLLDLRDDDUULRLRDUURLURRUDDURRUUDUDLDDLDULDDDDDULRULRDLRLDLRDLDDLUDRDUUDLDUDUDLLLRLUUDRUDDDRDRURRLLLDLUULDUULRDLULLUURLDRRRLDRLUDRRURLDULULDRUDDULLLDRDLLULUDDDDRDRULDULRRRRDDRULDLRDU",
		"DLDDRRDLLDUURRLULLLLRDRLUDURLDRRDURRRRUUDDUDRRDDDRRLDDLDDLURDLDRLUDULDUDUUDDDLLULRRLLUDULLLUULDDRDDUDUUDULURULULLDRLRUURDRDDLRRUDRUULLLLURRUDRDULDDRURRURLLLLLRLLLRLLUDUDLRDLULDUDLULLLUUDLLDDDUDUDLLRRDLRDLLLRRLRUDRDUDRURLUUURULLDDDDLLURDULURRLLLRLRRULLRRRLUUULLLLRLRDUURRDUURLLLDRDURRRULDDUDRRDLRLDLLRUDDLLUDRLLUUDRLLLLLLUDLURLLRUDRUUUULDLUDULLDDDDRLURUURDDDURRRLRLUDUUDURDDDDRRLRDLURDDLLULDRDDURLLURULUUUUURDUUULDRRLLURRRRRLDDUULLRULLDLDLDLRRRDRLDRUUD",
		"RLDRRRURULDLUDLDUDLLDUUURRDUDDURULLRRDDULUUDRRRULRUURRRLUUULRDRUDRRLLRLURDLDRDRDLLUDRUULRUDRUDDRURLRLURRDDRRURUUDRRDDRURURUDUUUDUDRRLRDRUUURLLUUUDLRUUDDRDDDDLDRLRDUDDULDDLRLLRURLLURLDDLDLDDULLDDUUURDLRUDUUDLDURDDRUULDRDDRDDDUUUDRDRDDRRDRRDLRDRURDUDDLUUUDULLUULULULRDRUUDDURURDRRRRLUDLDUDURLDRURDLLUUUDLRRDRRURDDULULURLDUDDLUDLDDLLRLDULLULULURUURLDULUDLLUUDLDDULDRRDDUULLUDLDLLRDRDURDDURDDURLDDURUURLLRURURUDDURRDRLRLDDUUDUULRDLLURRRRULURULDUDUDDUDDRLLLDLURDUURUURLUULRRLDLULDDRLDDUURULURUDRD",
		"URLDDRLLRRLDRLLRRURURURDDLRRRUUUURULRRUUDLUDRULLDLRUDDLULRUULDULURLLRLLUDDUDLURDRRRRLURULRURRURRULRRRULDLLDDLRLUDULUUUDDUDDRRDDDDUULRRLDRRULULRDUURRLDDRDULDURUDUDDLDLLURDDLDDRUDUUUDUUURDLDUDUUULLDLRDULRRRDLLURLDLLULRDDULULURLRLUULRLLLDDDUDLLDLURRRULRDUDDLULUDRUDDURULRLRUDDURLLURULLURDRULDUDLDULRRDLDURLUURRDDUDDUDRURUDDURRUUDURUULLLLDDRDDDDDULUUDDURRULLDRRLRRRRRDDRUUDDDURDRDRUDDUULDUDRRDRULUURLURLUDUDULDDRDULDLRUUDLLLRRLRDRDDUUULRDUDLUDLURRDUURDULDRLLDRDULDUDUULRLLDLRLDLUUDLRUULDUUULDLRLRLUULLLLRLRDUDRUUDURLDUDRRURLRUDRRLRDDLRDDLDDUDDDRLRLLRLUUURLURRRLULRLLDRLRDDRRDRL",
		"DLLLLLLRLRDRUDLRLLRLDLRURRUURLDLDDDDDUDUULLLLRRLRRDUUDUDLULLRRDULUDLLULURLRULURUULRLURDUDLUDULULUUURLRUDULURULRURULURLRLDRRRRLUDLLDULLDDLLULUURRULRDURDUUDDDURRUDLLLLRLDLUDDULLDUDDURURURRRRULDULULUDDUUDRLRLLLDLLLUUUURUDUUDLDLLRLRDDUULLUURLDDLRRDRLULDLULRULDLDURLULUURRRUDLLRDLUDDULRULULUDDURDLUUURDUUURDUDURLUUDRLUDRULUDDRRDLUUDLLLRDDDDDDLDURDDLDRDLUUDRULLUDRDLDULLULDDRUUDRRLRURRUULLRLRDUUURRDRRDULDDULUUDDURLULRLRURLLRRR"
	};

}
