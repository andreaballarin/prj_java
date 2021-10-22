//Scrivere un programma che presenti a schermo una lista, in ordine crescente, di tutti i multipli di 5 compresi fra 10 e 100, uno per linea.  
//Modificare poi il programma in modo che la lista appaia in ordine decrescente. 
public class Esercizio22106 {
	public static void main(String[] args) {
		System.out.println("Ordine crescente");
		for (int i = 10; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Ordine descrescente");
		for (int i = 100; i >= 10; i--) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
