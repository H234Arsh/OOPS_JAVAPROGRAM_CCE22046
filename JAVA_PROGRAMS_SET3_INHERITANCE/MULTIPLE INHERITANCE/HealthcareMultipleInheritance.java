// Interface 1
interface VitalSigns {
    void measure();
}

// Interface 2
interface Connectivity {
    void uploadData();
}

// Class implementing multiple interfaces
class SmartHealthMonitor implements VitalSigns, Connectivity {
    @Override
    public void measure() {
        System.out.println("Measuring heart rate, blood pressure, and oxygen levels...");
    }

    @Override
    public void uploadData() {
        System.out.println("Uploading patient data securely to hospital cloud server...");
    }
}

// Main class
public class HealthcareMultipleInheritance {
    public static void main(String[] args) {
        SmartHealthMonitor device = new SmartHealthMonitor();

        // Using both interface methods
        device.measure();
        device.uploadData();
    }
}
