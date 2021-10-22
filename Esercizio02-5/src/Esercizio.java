import java.util.Scanner;

/*
 * Argomento: divisione intera / e modulo %
Scrivere un programma che

    definisce due orari nel formato "24 ore", ad esempio, 1940 oppure 2350)
    visualizza sull'output standard il numero di ore e di minuti (separatamente) che intercorrono fra i due orari 

secondo il seguente esempio:
  primo orario: 1940
  secondo orario: 2350
  Tempo trascorso: 4 ore e 10 minuti

Modificare poi il programma in modo che funzioni correttamente anche se il secondo orario e` inferiore al primo (per intervalli di tempo che comprendono la mezzanotte):
  primo orario: 2350
  secondo orario: 1940
  Tempo trascorso: 19 ore e 50 minuti

Attenzione: nel caso in cui un orario sia precedente alle 1200, il primo zero delle ore va omesso (ad esempio, bisogna scrivere 700, oppure 900). Questo perche' una costante numerica che inizia con uno 0 viene interpretata da java come espressa in formato ottale (ad esempio, 0700 verrebbe interpretato come il numero 448, mentre 0900 produrrebbe un errore in compilazione perche' 9 non e' una cifra ottale).


 */
public class Esercizio {
	public static void main(String[] args) {
		System.out.println("Tempo iniziale");
		Scanner c = new Scanner(System.in);
		int x = c.nextInt();
		String inizio=""+x;
		System.out.println("Tempo finale");
		Scanner c1 = new Scanner(System.in);
		int y = c1.nextInt();
		String fine=""+y;
		String hInizio=inizio.substring(0, 2);
		String mInizio=inizio.substring(2, 4);
		String hFine=fine.substring(0, 2);
		String mFine=fine.substring(2, 4);
		Integer hFinal=Integer.parseInt(hInizio)-Integer.parseInt(hFine);
		Integer mFinal=Integer.parseInt(mInizio)-Integer.parseInt(mFine);
		System.out.println("Sono trascorse "+ hFinal + " ore e "+mFinal+" minuti");
	}
}
