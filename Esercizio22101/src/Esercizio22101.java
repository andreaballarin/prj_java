
//Scrivere un programma che calcola la somma e il prodotto dei primi 10 numeri interi
public class Esercizio22101 {
	public static void main(String[] args) {
		int sum = 0;
		int pro = 1;
		for (int i = 1; i < 10; i++) {
			sum = sum + i;
			pro *= i;
		}
		System.out.println(sum);
		System.out.println(pro);
	}

}
