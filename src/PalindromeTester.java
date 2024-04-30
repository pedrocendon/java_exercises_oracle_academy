import java.util.Scanner;
public class PalindromeTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma palavra:");
        String word = in.next();
        int firstPosition = 0;
        int lastPosition = word.length() - 1;
        boolean isAPalindrome = true;

        while(firstPosition < lastPosition){
            if (word.charAt(firstPosition) != word.charAt(lastPosition)) {
                isAPalindrome = false;
                break;
            }
            firstPosition++;
            lastPosition--;
        }
            if(isAPalindrome)
                System.out.println("A palavra é um Palíndromo!");
            else
                System.out.println("A plavra não é um Palíndromo!");
    }
}
