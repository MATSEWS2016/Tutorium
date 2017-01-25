import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Summe {

	public static int[] bereicheAddieren(int untergrenze, int obergrenze) {
		// [5,6,7,8,9,10]
		ArrayList<Integer> elemente = new ArrayList<>();
		elemente.add(untergrenze);
		int counter = 1;
		do {
			elemente.add(untergrenze + counter);
			counter++;
		} while (counter != Math.abs(obergrenze - untergrenze));
		elemente.add(obergrenze);

		int zahl;
		int u = 0;
		int o = 0;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Geben Sie eine Zahl ein ");
			zahl = scan.nextInt();

			if (zahl >= elemente.get(0) && zahl <= elemente.get(elemente.size() - 1)) {
				u += zahl;
			} else if (zahl < elemente.get(0) || zahl > elemente.get(elemente.size() - 1)) {
				o += zahl;
			}
		} while (zahl != 0);

		return new int[] { u, o };
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(bereicheAddieren(5, 10)));
	}

}
