public class DataOperations {
    public static void main(String[] args) {
        int h = 15, b = 4;
        double x = 3.5, y = 2.0;

        System.out.println("Addition: " + (h + b));
        System.out.println("Subtraction: " + (h - b));
        System.out.println("Multiplication: " + (h * b));
        System.out.println("Division: " + (h / b));
        System.out.println("Modulus: " + (h % b));

        System.out.println("Double Division: " + (x / y));
        System.out.println("Increment: " + (++h));
        System.out.println("Decrement: " + (--b));

        boolean result = h > b;
        System.out.println("Is h > b? " + result);

        h += 5; 
        System.out.println("New value of h: " + h);
    }
}
