package exemplo;

import java.util.Scanner;

public class EquacaoDoSegundoGrau {
	
	//Variaveis
	double a, b, c, delta, x1, x2;
	Scanner input = new Scanner(System.in);

	EquacaoDoSegundoGrau() {
	}

	//Construtor
	EquacaoDoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Metodo geral
	public void executa() {
		int confirmacao;
		Scanner entrada = new Scanner(System.in);

		do {
			lerCoeficientes();
			calcula();

			System.out.println("\n\n\nDeseja executar novamente? (sim = 1 / não = 0)");
			confirmacao = entrada.nextInt();
		} while (confirmacao == 1);

		entrada.close();
	}

	//Metodo p/ entrada usuario
	public void lerCoeficientes() {
		System.out.println("Informe o valor do coeficiente a:");
		a = input.nextDouble();

		System.out.println("Informe o valor do coeficiente b:");
		b = input.nextDouble();

		System.out.println("Informe o valor do coeficiente c:");
		c = input.nextDouble();
	}

	//Metodo Calcula com If e Else
	public void calcula() {
		if (a == 0)
			if (b == 0)
				if (c == 0)
					System.out.println("Igualdade confirmada: 0 = 0.");
				else
					System.out.println("Coeficientes informados incorretamente.");
			else {
				System.out.println("Esta é uma equação de primeiro grau.");
				x1 = -c / b;
				System.out.println("x = " + x1);
			}
		else {
			System.out.println("Esta é uma equação de segundo grau.");
			delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0)
				System.out.println("Esta equação não possui raízes reais: delta = " + delta);
			else if (delta == 0) {
				System.out.println("Esta equação possui duas raízes reais iguais.");
				x1 = -b / (2 * a);
				System.out.println("x1 = x2 = " + x1);
			} else {
				System.out.println("Esta equação possui duas raízes reais diferentes.");
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}

		}

	}
}

