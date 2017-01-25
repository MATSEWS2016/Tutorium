
public class Leerzeichen {

	public static String compressSpace(String s) {
		String ret = "";
		String ret2 = ""; //String s ohne Leerzeichen am Anfang
		int counter = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != (char) 32) {
				ret += s.substring(i);
				break;

			}
		}

		for (int i = 0; i < ret.length(); i++) {
			if (ret.charAt(i) == (char) 32) {
				counter++;
			}
			if (ret.charAt(i) == (char) 32 && counter <= 1) {
				ret2 += ret.charAt(i);
			} else if (ret.charAt(i) != (char) 32) {
				ret2 += ret.charAt(i);
				counter = 0;
			}
		}
		return ret2;
	}

	public static void main(String[] args) {
		System.out.println(compressSpace("     intan          cantik        sekali      "));

	}

}
