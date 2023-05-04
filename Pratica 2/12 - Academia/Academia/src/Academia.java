import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe o sexo (M/F): ");
        String sexo = sc.next();

        double mensalidade = 0.0;

        if (sexo.equalsIgnoreCase("M")) { // Cliente do sexo masculino
            if (idade <= 15) {
                mensalidade = 60.0;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.0;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.0;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.0;
            } else { // idade > 40
                mensalidade = 80.0;
            }
        } else { // Cliente do sexo feminino
            if (idade <= 18) {
                mensalidade = 60.0;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.0;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.0;
            } else { // idade > 40
                mensalidade = 80.0;
            }
        }

        System.out.printf("Mensalidade: R$ %.2f\n", mensalidade);
        sc.close();
    }
}
