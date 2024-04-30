import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int answer = 0;

        System.out.print("Enter a number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the operand: ");
        char input = in.next().charAt(0);

        System.out.print("Enter another number: ");
        int num2 = in.nextInt();

        switch (input){
            case '*'  -> answer  = num1 * num2;
            case '/'  -> answer  = num1 / num2;
            case '&'  -> answer  = num1 & num2;
            case '+'  -> answer  = num1 + num2;
            case '-'  -> answer  = num1 - num2;
            default -> System.out.println("Invalid Command.");
        }
        System.out.println("The result is: " + answer);
    }
}
