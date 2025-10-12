package example.AbstractClass;

abstract class Payment {
	abstract void processPayment();

	void welcomeMSG() {
		System.out.println();
		System.out.println("Welcome to Online Payment Platform...");
	}
}

class Upi extends Payment {

	void processPayment() {
		System.out.println("Processing payment through UPI...");
	}
}

class NetBanking extends Payment {
	void processPayment() {
		System.out.println("Processing payment through Netbanking...");
	}
}

class DigiWallet extends Payment {
	void processPayment() {
		System.out.println("Processing payment through Digi-Wallet...");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Payment p;
		p = new Upi();
		p.welcomeMSG();
		p.processPayment();

		p = new NetBanking();
		p.welcomeMSG();
		p.processPayment();

		p = new DigiWallet();
		p.welcomeMSG();
		p.processPayment();
	}
}
