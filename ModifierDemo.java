class ModifierDemo {
    public int pub = 1;
    protected int prot = 2;
    int def = 3; // default
    private int priv = 4;

    public void showPublic() {
        System.out.println("Public: " + pub);
    }

    protected void showProtected() {
        System.out.println("Protected: " + prot);
    }

    void showDefault() {
        System.out.println("Default: " + def);
    }

    private void showPrivate() {
        System.out.println("Private: " + priv);
    }

    public void accessAll() {
        showPublic();
        showProtected();
        showDefault();
        showPrivate();
    }
}

public class AccessModifierTest {
    public static void main(String[] args) {
        ModifierDemo obj = new ModifierDemo();
        obj.accessAll();
    }
}
