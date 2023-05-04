import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = input.nextInt();

        double valorDiaria = 500.0;
        double taxaServicos;

        if (numDiarias < 15) {
            taxaServicos = 15.0;
        } else if (numDiarias == 15) {
            taxaServicos = 10.0;
        } else {
            taxaServicos = 5.0;
        }

        double total = numDiarias * (valorDiaria + taxaServicos);

        System.out.printf("O total a ser pago é R$ %.2f", total);

        input.close();
    }
}