package notas;
import java.util.Scanner;

public class Var {
   
    //Variaveis
    double nota1;
    double nota2;
    double resultado;
  
    //Construtor
    public Var(double nota1, double nota2, double resultado) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.resultado = resultado;
    }

    //Gets e Sets
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
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

    public void lerCoeficientes (){
    Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a 1° nota: ");
        nota1 = entrada.nextDouble();

        System.out.print("Digite a 2° nota: ");
        nota2 = entrada.nextDouble();
    }

    public void calcula (){
    resultado = (nota1 + nota2) /2;

    if (resultado >= 7){
    System.out.print("Você esta aprovado! ");
    }

    if (resultado <= 7){
    System.out.print("Você esta reprovado! ");
    }
}
}