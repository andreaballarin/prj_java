package GestionaleValute;

import java.util.*;

public class GestionaleValute {
	public static void main(String[] args) {
		System.out.println("Benvenuto nel gestionale per convertire le valute");
		int scelta;
		do {
			System.out.println("Di seguito sono riportate delle scelte, selezionane una!");
			System.out.println("Clicca: 1+invio per convertire Euro a Dollaro");
			System.out.println("Clicca: 2+invio per convertire Dollaro a Euro");
			Scanner c = new Scanner(System.in);
			scelta = c.nextInt();
			double euro;
			double dollari;

			switch (scelta) {
			case 1:
				System.out.println("Bene, dimmi la somma di quanti euro vuoi convertire");
				euro = c.nextDouble();
				System.out.println("Esattamente, " + euro + " euro equivalgono a " + euro * 0.85 + " dollari");
				break;
			case 2:
				System.out.println("Bene, dimmi la somma di quanti dollari vuoi convertire");
				dollari = c.nextDouble();
				System.out.println("Esattamente, " + dollari + " dollari equivalgono a " + dollari / 0.85 + " euro");
				break;
			default:
				System.out.println("Immetti una scelta valida!!");
				break;
			}
			System.out.println("");
			System.out.println("");
		} while (scelta != 0);
	}

}
