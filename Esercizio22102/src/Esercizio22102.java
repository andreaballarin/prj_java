
//Scrivere un programma che calcola la somma e il prodotto dei primi 10 numeri interi pari.
public class Esercizio22102 {
	public static void main(String[] args) {
		int sum = 0;
		int pro = 1;
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				pro *= i;
			}
		}
		System.out.println("La somma: " + sum);
		System.out.println("Il prodotto: " + pro);
	}

}
