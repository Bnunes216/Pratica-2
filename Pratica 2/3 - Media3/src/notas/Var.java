package notas;
import java.util.Scanner;

public class Var {
    
    //Variaveis
    double nota1;
    double nota2;
    double nota3;
    double calculo;
    
    //Construtor
    public Var(double nota1, double nota2, double nota3, double calculo) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.calculo = calculo;
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
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getCalculo() {
        return calculo;
    }
    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

	//Metodo geral
	public void executa() {
		int confirmacao;
		Scanner entrada = new Scanner(System.in);

		do {
			capturaDados();
			calcula();

			System.out.println("\n\n\nDeseja executar novamente? (sim = 1 / não = 0)");
			confirmacao = entrada.nextInt();
		} while (confirmacao == 1);

		entrada.close();
	}

    public void capturaDados(){
      Scanner in = new Scanner (System.in);
      
      System.out.println("Digite a 1° nota: ");
      nota1 = in.nextDouble();

      System.out.println("Digite a 2° nota: ");
      nota2 = in.nextDouble();

      System.out.println("Digite a 3° nota: ");
      nota3 = in.nextDouble();
    }

    public void calcula (){
    calculo = (nota1 + nota2 + nota3) /3;
       
    if (calculo >= 0 && calculo < 3)
    System.out.println("Reprovado ");

    if (calculo >= 3 && calculo < 7)
    System.out.println("Exame ");

    if (calculo >= 7 && calculo <= 10)
    System.out.println("Aprovado! ");
}
}