
public class BefreundeteZahlen {

	public static boolean sindBefreundet(int a, int b) {
		int tA = 0;
		int tB = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				tA += i;
			}
		}
		for (int i = 1; i < b; i++) {
			if (b % i == 0) {
				tB += i;
			}
		}

		if (a == tB && b == tA) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(sindBefreundet(220, 284));

	}

}
