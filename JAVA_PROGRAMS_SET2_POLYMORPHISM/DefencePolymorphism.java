// Base class
abstract class Weapon {
    abstract void fire();
}

// Child class 1
class Rifle extends Weapon {
    @Override
    void fire() {
        System.out.println("Rifle fired: Single shot at medium range.");
    }
}

// Child class 2
class Missile extends Weapon {
    @Override
    void fire() {
        System.out.println("Missile launched: Long-range target destroyed.");
    }
}

// Child class 3
class Drone extends Weapon {
    @Override
    void fire() {
        System.out.println("Drone deployed: Surveillance and strike mode activated.");
    }
}

// Main class
public class DefencePolymorphism {
    public static void main(String[] args) {
        // Polymorphism: Parent reference → different child objects
        Weapon w1 = new Rifle();
        Weapon w2 = new Missile();
        Weapon w3 = new Drone();

        // Same method, different behavior
        w1.fire();
        w2.fire();
        w3.fire();
    }
}
