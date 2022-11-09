import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota de 0 à 10: ");
        nota = scan.nextInt();

        // "|"" é igual a "OU"
        while (nota < 0 | nota > 10) {
            System.out.println("Valor Inválido! Digite uma nota de 0 à 10: ");
            nota = scan.nextInt();
        }

        System.out.println("Fim");
    }
}
