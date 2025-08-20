// Parent class
class Citizen {
    String name;
    String aadharNumber;

    Citizen(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadharNumber);
    }
}

// Child class
class GovernmentEmployee extends Citizen {
    String department;

    GovernmentEmployee(String name, String aadharNumber, String department) {
        super(name, aadharNumber); // calling parent constructor
        this.department = department;
    }

    void showEmployeeDetails() {
        showDetails(); // parent method
        System.out.println("Department: " + department);
    }
}

// Main class
public class GovernmentDatabase {
    public static void main(String[] args) {
        GovernmentEmployee emp = new GovernmentEmployee("Ravi Kumar", "1234-5678-9012", "Income Tax Department");
        emp.showEmployeeDetails();
    }
}
