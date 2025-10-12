package example.Interface;

public interface Payment {
	void paymentInitiated();
	void paymentProcessing();
	void paymentCompleted(boolean status);
}
