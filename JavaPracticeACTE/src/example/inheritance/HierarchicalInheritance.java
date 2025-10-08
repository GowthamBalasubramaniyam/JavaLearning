package example.inheritance;

class Employeex {
    void commonAccess() {
        System.out.println("Accessing company portal...");
    }
}

class Developerx extends Employeex {
    void writeCode() {
        System.out.println("Developer writing code");
    }
}

class Tester extends Employeex {
    void testApp() {
        System.out.println("Tester testing the application");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Developerx dev = new Developerx();
        Tester tester = new Tester();

        dev.commonAccess();
        dev.writeCode();

        tester.commonAccess();
        tester.testApp();
    }
}
