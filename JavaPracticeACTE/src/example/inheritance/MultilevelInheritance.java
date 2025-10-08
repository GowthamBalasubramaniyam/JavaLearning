package example.inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamLead tl = new TeamLead();
		tl.login();
		tl.writing();
		tl.Review();
	}
}
class Employee{
	void login() {
		System.out.println("Employee loggedIn");
	}
}

class Developer extends Employee{
	void writing() {
		System.out.println("Developer writing codes");
	}
}

class TeamLead extends Developer{
	void Review() {
		System.out.println("Team lead reviewing codes");
	}
}