package Aplicacao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int Numero;

        System.out.print("Enter a number: ");
        Numero = in.nextInt();

        System.out.println("O valor de " + Numero + "! e "  + CalculaFatorial(Numero));

        System.out.println("O valor de " + Numero + "! e "  + CalculaFatorial_Recursivo(Numero));
    }

    public static int CalculaFatorial(int Numero){

        int Resultado = 1;

        for (int i = Numero; i > 0; i--)
            Resultado *= i;

        return Resultado;
    }

    public static int CalculaFatorial_Recursivo(int Numero){

        if (Numero == 0)
            return 1;
        else
            return Numero * CalculaFatorial_Recursivo(Numero - 1);
    }
}
