import java.util.Scanner;
public class LoopPractice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 10, sum = 0, input;
        for (int i = 0; i < numInputs; i++){
            input = in.nextInt();
            sum+=input;
        }
        System.out.println("The sum of those ten numbers is: " + sum);
    }
}
