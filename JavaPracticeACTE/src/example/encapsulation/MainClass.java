package example.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankClass obj = new BankClass();
		obj.createAccount("Gowtham", "ACC04014", 10000);
		obj.viewBalance();
		obj.credit(5000);
		obj.debit(7000);
		obj.viewBalance();
		obj.deleteAcc();
	}
}
