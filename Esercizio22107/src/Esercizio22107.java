import java.util.Scanner;


/*
 * Argomento: rappresentazione dei numeri; divisione intera / e modulo %, metodi della classe String
Scrivere un programma che

    legga dall'input standard un numero intero positivo avente al massimo cinque cifre
    visualizzi sull'output standard le singole cifre del numero, separandole con uno spazio

Ad esempio, il numero 14356 verrà visualizzato come 1 4 3 5 6.
Il numero 367 verrà visualizzato come 0 0 3 6 7.

Realizzare due diverse soluzioni:

    usando l'aritmetica dei numeri interi e ricordando le proprietà della divisione intera in Java
    usando il metodo substring della classe String, dopo aver convertito il numero intero in stringa (per convertire un numero in stringa è sufficiente usare l'operatore + tra l'intero stesso ed una qualsiasi stringa.  Es: con l'istruzione  String s = "" + 15, s risulta "15")

Verificare il corretto funzionamento del programma in casi diversi (in particolare, con numeri aventi meno di cinque cifre) e verificare il comportamento del programma in caso di valori di ingresso non ammessi

    numeri con più di cinque cifre
    numeri negativi
    numeri in virgola mobile
    valore di ingresso non numerico (ad esempio, Ciao)
 */
public class Esercizio22107 {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Dimmi il numero");
		int numero = c.nextInt();
		String s = ""+numero;
		for (int i = 0; i < s.length(); i++) {
		
			System.out.print(s.substring(i) + " ");
		}

	}

}
