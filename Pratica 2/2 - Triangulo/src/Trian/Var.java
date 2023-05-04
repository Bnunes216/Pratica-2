package Trian;
import java.util.Scanner;

public class Var {
    
    //variaveis
    int lado1;
    int lado2;
    int lado3;
    
    //Construtor
    public Var(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //Gets e Sets
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public int getLado3() {
        return lado3;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    //Metodo Geral
    public void executa() {
		int confirmacao;
		Scanner in = new Scanner(System.in);

		do {
			lerCoeficientes();
			calcula();

			System.out.println("\n\n\nDeseja executar novamente? (sim = 1 / não = 0)");
			confirmacao = in.nextInt();
		} while (confirmacao == 1);

		in.close();
	}

    public void lerCoeficientes(){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o 1° cateto: ");
        lado1 = in.nextInt();

        System.out.println("Digite o 2° cateto: ");
        lado2 = in.nextInt();

        System.out.println("Digite o 3° cateto: ");
        lado3 = in.nextInt();
    }

    public void calcula (){
    
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado1 || lado2 == lado3 || lado3 == lado1 || lado3 == lado2){
        System.out.println("Você tem um triângulo Isósceles");
    }

        else if (lado1 == lado2 && lado1 == lado3){
        System.out.println("Você tem um triângulo Equilátero");
    }

        else {
        System.out.println("Você tem um triângulo Escaleno");
    }
    
}
}

