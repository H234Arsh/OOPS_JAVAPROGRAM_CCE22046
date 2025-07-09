public class DataTypesCombo {
    public static void main(String[] args) {
        byte b = 120;
        short s = 32000;
        int i = 100000;
        long l = 12345678900L;
        float f = 10.5f;
        double d = 99.99;
        char c = 'Z';
        boolean isJavaFun = true;

        System.out.println("Byte + Short = " + (b + s));
        System.out.println("Int + Long = " + (i + l));
        System.out.println("Float + Double = " + (f + d));
        System.out.println("Char = " + c + " -> Unicode: " + (int)c);
        System.out.println("Boolean isJavaFun = " + isJavaFun);
    }
}
