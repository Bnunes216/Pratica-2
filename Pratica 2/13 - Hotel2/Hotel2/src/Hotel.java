import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoApto;
        int dias;
        double valorDiaria, total;

        System.out.print("Digite o tipo de apartamento (Simples/Duplo): ");
        tipoApto = sc.nextLine();

        System.out.print("Digite a quantidade de dias hospedado: ");
        dias = sc.nextInt();

        if (tipoApto.equalsIgnoreCase("Simples")) {
            if (dias < 10) {
                valorDiaria = 100.0;
            } else if (dias <= 15) {
                valorDiaria = 90.0;
            } else {
                valorDiaria = 80.0;
            }
        } else { // Apto Duplo
            if (dias < 10) {
                valorDiaria = 140.0;
            } else if (dias <= 15) {
                valorDiaria = 120.0;
            } else {
                valorDiaria = 100.0;
            }
        }

        total = valorDiaria * dias;
        System.out.printf("Total a ser pago: R$ %.2f", total);

        sc.close();
    }
}