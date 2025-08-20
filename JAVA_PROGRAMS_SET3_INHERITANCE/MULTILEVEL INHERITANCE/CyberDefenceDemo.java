// Level 1: Base class
class Firewall {
    void filterTraffic() {
        System.out.println("Firewall: Blocking unauthorized network access.");
    }
}

// Level 2: Derived class
class IntrusionDetectionSystem extends Firewall {
    void detectIntrusion() {
        System.out.println("IDS: Monitoring network and detecting intrusions.");
    }
}

// Level 3: Further derived class
class AutonomousCyberDefender extends IntrusionDetectionSystem {
    void counterAttack() {
        System.out.println("Cyber Defender: Launching countermeasures against attack source.");
    }
}

// Main class
public class CyberDefenceDemo {
    public static void main(String[] args) {
        AutonomousCyberDefender defender = new AutonomousCyberDefender();

        // Methods from all levels
        defender.filterTraffic();   // from Firewall
        defender.detectIntrusion(); // from IDS
        defender.counterAttack();   // from Cyber Defender
    }
}
