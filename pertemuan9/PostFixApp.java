package Tugas_P12;

import java.util.Scanner;

public class PostFixApp {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			ParsePost parser = new ParsePost();

			System.out.print("Masukkan ekspresi postfix: ");
			String ekspresi = input.nextLine();

			int hasil = parser.doParse(ekspresi);
			System.out.println("Hasil: " + hasil);
		}
    }
}
