package example.encapsulation;

public class BankClass {

	private String name;
	private String accno;
	private int balance;

	public void createAccount(String name, String accno, int amount) {
		this.name = name;
		this.accno = accno;
		this.balance = amount;
		System.out.println(
				"Account created successfully" + " Name : " + name + " AccNo : " + accno + " Balance : " + balance);
	}

	public void viewBalance() {
		System.out.println("Your current balance is " + balance);
	}

	public void credit(int amount) {
		this.balance += amount;
		System.out.println("Amount credited , your current balance is " + balance);
	}

	public void debit(int amount) {
		this.balance -= amount;
		System.out.println("Amount debited , your current balance is " + balance);
	}
	
	public void deleteAcc() {
		this.name=null;
		this.accno=null;
		this.balance=0;
	}
}
