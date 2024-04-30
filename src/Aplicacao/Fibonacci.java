package Aplicacao;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int QtdeNros;
        int Ultimo, Penultimo, Proximo;

        do {
            System.out.print("Informe a quantidade de numeros a serem mostrados (>=5): ");
            QtdeNros = in.nextInt();
        } while (QtdeNros < 5);

        Ultimo = 0;
        Penultimo = 0;

        for (int i = 0; i < QtdeNros; i++){

            if ((Ultimo == 0) && (Penultimo == 0))
                Proximo = 1;
            else
                Proximo = Ultimo + Penultimo;

            System.out.print(Proximo + " ");

            Penultimo = Ultimo;
            Ultimo = Proximo;

        }

    }
}
