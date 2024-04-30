package Inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tempNumber;
        String tempName;
        int tempQtd;
        double tempPrice;

        int maxSize = -1;

        System.out.println("Digite o numero de produtos a adicionar");

        try {
            do {
                System.out.println("Insira 0 (zero) se nao quiser adicionar produtos: ");
                maxSize = in.nextInt();

                if (maxSize < 0) {
                    System.out.println("Valor inserido esta incorreto");
                } else if (maxSize == 0) {
                    System.out.println("Nao ha produtos");
                } else {

                        Produto[] produtos = new Produto[maxSize];

                        for (int i = 0; i < produtos.length; i++) {

                            System.out.print("[ PRODUTO - " + (i + 1) + " ]\n");

                            System.out.print("Numero do produto: ");
                            tempNumber = in.nextInt();

                            System.out.print("Nome: ");
                            tempName = in.next();

                            System.out.print("Quantidade: ");
                            tempQtd = in.nextInt();

                            System.out.print("Preco: ");
                            tempPrice = in.nextDouble();

                            produtos[i] = new Produto(tempNumber, tempName, tempQtd, tempPrice);

                        }

                        for (Produto produto : produtos) {
                            System.out.println(produto);
                        }
                }
            } while (maxSize < 0);

        } catch (InputMismatchException e) {
                 System.out.print("Tipo incorreto inserido");
                 e.printStackTrace();
                 in.close();
        }
    }
}
