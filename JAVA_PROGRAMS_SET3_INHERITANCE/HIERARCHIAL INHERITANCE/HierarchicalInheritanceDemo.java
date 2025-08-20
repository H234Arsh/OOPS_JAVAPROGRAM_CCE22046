// Parent class (base)
class HospitalStaff {
    String name;

    HospitalStaff(String name) {
        this.name = name;
    }

    void duty() {
        System.out.println(name + ": Performs general hospital duties.");
    }
}

// Child 1
class Doctor extends HospitalStaff {
    Doctor(String name) {
        super(name);
    }

    @Override
    void duty() {
        System.out.println(name + " (Doctor): Diagnoses and treats patients.");
    }
}

// Child 2
class Nurse extends HospitalStaff {
    Nurse(String name) {
        super(name);
    }

    @Override
    void duty() {
        System.out.println(name + " (Nurse): Monitors vitals and assists in care.");
    }
}

// Child 3
class Pharmacist extends HospitalStaff {
    Pharmacist(String name) {
        super(name);
    }

    @Override
    void duty() {
        System.out.println(name + " (Pharmacist): Dispenses medications safely.");
    }
}

// Demo
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        HospitalStaff s1 = new Doctor("Dr. Rao");
        HospitalStaff s2 = new Nurse("Anita");
        HospitalStaff s3 = new Pharmacist("Kiran");

        // Same parent reference type, different child implementations
        s1.duty();
        s2.duty();
        s3.duty();
    }
}