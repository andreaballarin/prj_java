//Stampare la tabella dei caratteri ASCII. 
public class Esercizio22104 {
	public static void main(String[] args) {

		for (int i = 0; i <= 255; i++) {
			// Faccio un cast a char del numero intero i
			System.out.println("Simbolo ASCII " + (char) i + " = " + i);
		}

	}

}
