import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeParcelas = 0;
        double juros = 0.10, valorEmprestimo = 0, taxas = 0;

        System.out.println("Qual o valor de empréstimo desejado? ");
        valorEmprestimo = scan.nextDouble();

        System.out.println("Em quantas parcelas deseja pagar o empréstimo? ");
        quantidadeParcelas = scan.nextInt();

        taxas = valorEmprestimo + (quantidadeParcelas * (valorEmprestimo * juros));
        System.out.println("Valor solicitado: " + valorEmprestimo);
        System.out.println("Valor dos juros: " + juros + " ao mês");
        System.out.println("Quantidade de parcelas: " + quantidadeParcelas);
        System.out.println("Total a ser pago (taxas inclusas): " + taxas);
    }
}
