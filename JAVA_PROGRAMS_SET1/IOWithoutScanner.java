import java.io.*;

public class IOWithoutScanner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your city: ");
        String city = reader.readLine();
        System.out.print("Enter temperature (in °C): ");
        int temp = Integer.parseInt(reader.readLine());
        System.out.println("It's " + temp + "°C in " + city + " today.");
    }
}
