package example.Interface;

class Upi implements Payment {

	public void paymentInitiated() {
		System.out.println();
		System.out.println("UPI payment initiated...");
	}

	public void paymentProcessing() {
		System.out.println("UPI payment processing...");
	}

	public void paymentCompleted(boolean status) {
		if(status) {
			System.out.println("UPI payment completed...");
		}else {
			System.out.println("UPI payment failed...");
		}
	}
}

class NetBanking implements Payment {

	public void paymentInitiated() {
		System.out.println();
		System.out.println("NetBanking payment initiated...");
	}

	public void paymentProcessing() {
		System.out.println("NetBanking payment processing...");
	}

	public void paymentCompleted(boolean status) {
		if(status) {
			System.out.println("NetBanking payment completed...");
		}else {
			System.out.println("NetBanking payment failed...");
		}
	}
}

class DigiWallet implements Payment {

	public void paymentInitiated() {
		System.out.println();
		System.out.println("DigiWallet payment initiated...");
	}

	public void paymentProcessing() {
		System.out.println("DigiWallet payment processing...");
	}

	public void paymentCompleted(boolean status) {
		if(status) {
			System.out.println("DigiWallet payment completed...");
		}else {
			System.out.println("DigiWallet payment failed...");
		}
	}
}

public class ClassInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p = new DigiWallet();
		p.paymentInitiated();
		p.paymentProcessing();
		p.paymentCompleted(true);
		
		p = new NetBanking();
		p.paymentInitiated();
		p.paymentProcessing();
		p.paymentCompleted(false);
		
		p = new Upi();
		p.paymentInitiated();
		p.paymentProcessing();
		p.paymentCompleted(true);
	}

}
