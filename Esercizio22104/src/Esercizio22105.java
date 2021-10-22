//Stampare una tabella con i valori delle potenze xy per ogni valore di x compreso tra 1 e 4 e per ogni valore di y tra 1 e 5.
public class Esercizio22105 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			System.out.print("X = " + i + " : ");
			for (int j = 1; j <= 5; j++) {
			System.out.print(" " + Math.pow(i, j) + " ");
			}
			System.out.println();
		}

	}

}
