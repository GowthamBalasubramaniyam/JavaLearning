package example.polymorphism;

class User {
	void dashboard() {
		System.out.println("showing user dashboard");
	}
}

class Admin extends User {
	void dashboard() {
		System.out.println("showing Admin dashboard");
	}
}

class Editor extends User {
	void dashboard() {
		System.out.println("showing Editor dashboard");
	}
}

class Viewer extends User {
	void dashboard() {
		System.out.println("showing Viewer dashboard");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		User u;
		u = new Admin();
		u.dashboard();

		u = new Editor();
		u.dashboard();

		u = new Viewer();
		u.dashboard();
	}

}
