import java.util.Scanner;

public class HoraDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horas;

        System.out.println("Que horas são? ");
        horas = scan.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        if (horas >= 12 && horas < 18) {
            System.out.println("Boa tarde!");
        }
        if (horas >= 18) {
            System.out.println("Boa noite!");
        }
    }
}
