import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int quantidade;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantos números serão inseridos? ");
        quantidade = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

        } while (count < quantidade);

        System.out.println("Quantidade pares: " + quantPares);
        System.out.println("Quantidade ímpares: " + quantImpares);
    }
}
