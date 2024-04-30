import java.util.Scanner;
public class StringChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        System.out.print("Enter your name:");
        name = in.nextLine();
        if (name.equals("Elvis")){
            System.out.println("You are the king of Rock and Roll");
        }
        else if (name.equals("Michael Jackson")){
            System.out.println("You are the king of pop!");
            }
        else
            System.out.println("You are not the king!");

    }
}
