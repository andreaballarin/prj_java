import java.util.Scanner;

//Scrivere un programma che legga da tastiera un numero intero e visualizzi tutti i numeri da 10 fino a quel numero.  
//Se il numero letto è minore di 10, non va visualizzato nulla.
public class Esercizio22103 {
	public static void main(String[] args) {

		System.out.println("Inserisci un numero");
		Scanner c = new Scanner(System.in);
		int numero = c.nextInt();
		do {
			for (int i = 10; i <= numero; i++) {
				System.out.println(i);
			}
		} while (numero < 10);

	}

}
