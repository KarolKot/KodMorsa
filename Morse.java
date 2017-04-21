import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",

				".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",

				"...-", ".--", "-..-", "-.--", "--..", "|" };
		String[] alfabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", " " };

		Scanner reader = new Scanner(System.in);
		System.out.println("Wpisz 1 dla Morse'a do słowa albo wpisz 2 dla słów do Morse'a.");
		String znak = reader.nextLine();
		String a = reader.nextLine();

		switch (a) {
		case "2": {
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Wpisz zdanie");
			String toMorse = scan2.nextLine();
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

		case "1": {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Wpisz kod Morsa");
			String toSlowa = scan1.nextLine();

			String[] czesci = toSlowa.split("\\|");
			for (int x = 0; x < czesci.length; x++) {
				for (int y = 0; y < morse.length; y++) {

					if (czesci[x].equals(morse[y]))

						System.out.println(alfabet[y]);
				}
			}

			break;
		}

		default: {
			System.out.println("Nieprawidłowa odpowiedz");
		}
		}

	}

}