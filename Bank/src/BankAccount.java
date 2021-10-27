
public class BankAccount {
	//variabili della classe
	private double balance;
	
	//costruttore
	public BankAccount(){
		 balance=0;
	}
	public BankAccount(double initialBalance){
		 balance=initialBalance;
	}
	
	//metodi
	public void deposita(double value) {
		 setBalance(getBalance() + value);
	}
	public void preleva(double value) {
		
		 setBalance(getBalance() - value);
	}
	//get e set
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
