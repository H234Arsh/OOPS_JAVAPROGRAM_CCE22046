public class ControlStatements {
    public static void main(String[] args) {
        int score = 95;

        // if-else
        if (score >= 90) {
            System.out.println("Grade: A+");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // switch
        char day = 'W';
        switch (day) {
            case 'M': System.out.println("Monday"); break;
            case 'W': System.out.println("Wednesday"); break;
            default: System.out.println("Other Day");
        }

        // for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            System.out.print(i + " ");
        }

        // while loop
        System.out.println("\nWhile loop:");
        int j = 5;
        while (j > 0) {
            if (j == 2) break; // exit at 2
            System.out.print(j + " ");
            j--;
        }

        // do-while loop
        System.out.println("\nDo-While loop:");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 3);
    }
}
