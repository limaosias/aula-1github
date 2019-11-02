package entities;

public class Account {	
	private String holder;
	private int number;
	private double balance;
	
	public Account(String holder, int number) {
		
		this.holder = holder;
		this.number = number;	
		
	}

	public Account(String holder, int number, double initialDeposit) {
	
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}

	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}	
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void whithdraw(double amount) {
		this. balance-= amount + 5.0;
				}
	public String toString(){
		return "Account "
				+number
				+", Holder: "
				+holder
				+", Balance $: "
				+String.format("%.2f", balance);
				
		
	}
}













