import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {
		String[] morse = { ".- ", "-... ", "-.-. ", "-.. ", ". ", "..-. ", "--. ", ".... ", ".. ",

				".--- ", "-.- ", ".-.. ", "-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ", "... ", "- ", "..- ",

				"...- ", ".-- ", "-..- ", "-.-- ", "--.. ", "|" };
		String[] alfabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", " " };

		int a;
		a = Input.getInt("Wpisz 1 dla Morse'a do słowa albo wpisz 2 dla słó do Morse'a.");

		switch (a) {
		case 2: {
			String toMorse = new String();
			toMorse = Input.getString("Wpisz zdanie");
			toMorse = toMorse.toUpperCase();
			for (int i = 0; i < toMorse.length(); i++) {
				char x = toMorse.charAt(i);
				if (x == ' ')
					System.out.print(" | ");
				else
					System.out.print(morse[x - 'A']);
			}

			break;
		}

		case 1: {
			String toSlowa = new String();
			toSlowa = Input.getString("Wpisz kod Morsa");

			String[] parts = toSlowa.split("|");
			for (int x = 0; x < parts.length; x++) {
				if (parts.equals(morse[x]))
					System.out.println(alfabet[x]);
			}

			break;
		}

		default: {
			System.out.println("Invalid Response");
		}
		}

	}

}