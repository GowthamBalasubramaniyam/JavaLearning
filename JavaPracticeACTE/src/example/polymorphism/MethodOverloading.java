package example.polymorphism;

class Error {
	void errorMessage(int code) {
		if (code == 400) {
			System.out.println("Invalid syntax or missing parameters.");
		} else if (code == 401) {
			System.out.println("Authentication required or failed (invalid token/login).");
		} else if (code == 404) {
			System.out.println("Resource or endpoint doesn’t exist.");
		}
	}

	void errorMessage(String message) {
		if (message == "Bad Request") {
			System.out.println("Invalid syntax or missing parameters.");
		} else if (message == "Unauthorized") {
			System.out.println("Authentication required or failed (invalid token/login).");
		} else if (message == "Not Found") {
			System.out.println("Resource or endpoint doesn’t exist.");
		}
	}

	void errorMessage(int code, String message) {
		if (code == 400 || message == "Bad Request") {
			System.out.println("Invalid syntax or missing parameters.");
		} else if (code == 401 || message == "Unauthorized") {
			System.out.println("Authentication required or failed (invalid token/login).");
		} else if (code == 404 || message == "Not Found") {
			System.out.println("Resource or endpoint doesn’t exist.");
		}
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Error er = new Error();
		er.errorMessage(404);
		er.errorMessage("Unauthorized");
		er.errorMessage(400, "Bad Request");
	}
}
