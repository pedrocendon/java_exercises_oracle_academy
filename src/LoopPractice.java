import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 0;
        int sum = 0, input = 10;
        do{
            System.out.println("Digite um numero:");
            input = in.nextInt();
            sum+=input;
            numInputs++;
        } while(numInputs < 10);
        System.out.println("A soma desses numeros e: "      + sum);
    }
}
