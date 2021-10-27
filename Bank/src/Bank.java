import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		BankAccount account1 = new BankAccount();
		System.out.println("Benvenuto nel sistema bancario");
		System.out.println("Il tuo conto ha già un saldo iniziale? 1=sì / 0=no");
		int scelta1 = c.nextInt();
		
		if (scelta1 == 1) {
			System.out.println("Dimmi il saldo iniziale del conto:");
			double initialBalance = c.nextDouble();
			 account1 = new BankAccount(initialBalance);
		}  else if (scelta1 == 0) {
			 account1 = new BankAccount();};
		
		
		while (account1.getBalance() >= 0) {
			do {
				System.out.println("----");
				System.out.println("Seleziona una scelta");
				System.out.println("Premi 1+invio per prelevare");
				System.out.println("Premi 2+invio per depositare");
				System.out.println("Premi 3+invio per visualizzare il saldo");
				int scelta = c.nextInt();
				switch (scelta) {
				case 2:
					System.out.println("Quanti soldi vuoi depositare?");
					double deposito = c.nextDouble();
					account1.deposita(deposito);
					break;
				case 1:
					System.out.println("Quanti soldi vuoi prelevare?");
					double prelevo = c.nextDouble();
					if (account1.getBalance() < prelevo)
						System.out.println("Saldo insufficiente");
					else
						account1.preleva(prelevo);
				case 3:
					System.out.println("Saldo: " + account1.getBalance());
				}
				;

			} while (0 < 1);
		}
		;

	}

}
