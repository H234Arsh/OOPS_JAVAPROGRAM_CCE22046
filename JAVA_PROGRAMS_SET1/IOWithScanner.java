import java.util.Scanner;
public class IOWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nickname: ");
        String name = sc.nextLine();
        System.out.print("Enter your lucky number: ");
        int lucky = sc.nextInt();
        System.out.println("Hey " + name + "! Your lucky number is " + lucky);
    }
}

