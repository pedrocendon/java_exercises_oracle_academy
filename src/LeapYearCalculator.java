import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the month:");
        int month = in.nextInt();

        System.out.println("Enter the year:");
        int year = in.nextInt();

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("That month has 30 days");
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("That month has 31 days");
            case 2:
                if ((year % 4 == 0 && (year & 100) != 0) || year % 400 == 0) {
                    System.out.println("That month has 29 days");
                } else
                    System.out.println("That month has 28 days");

            default: System.out.println("Invalid Input");
        }
    }
}
