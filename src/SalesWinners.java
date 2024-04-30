import java.util.Scanner;
public class SalesWinners {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many memberships did you sell?");
        int sales = in.nextInt();

        switch(sales) {
            case 6 -> System.out.println("You win $1000");
            case 5 -> System.out.println("You win a mystery box");
            case 4 -> System.out.println("You win a gift card");
            case 3 -> System.out.println("You win 1000 VBucks");
            case 2 -> System.out.println("You win $100 bonus");
            case 1 -> System.out.println("You win a pancake");
            default -> System.out.println("No Gift");
        }
    }
}
