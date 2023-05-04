package gordura;

import java.util.Scanner;

public class Var {
   
    //Variaveis
    private double peso;
    private double altura;
    private double imc;
    
    //Construtor
    public Var(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    //Gets e Sets
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getImc() {
        return imc;
    }

    //Construtor Geral
    public void executa (){
        int confirmacao;
        Scanner entrada = new Scanner (System.in);

        do {
			pegaDados();
			calcula();

			System.out.println("\n\n\nDeseja executar novamente? (sim = 1 / não = 0)");
			confirmacao = entrada.nextInt();
		} while (confirmacao == 1);

		entrada.close();
	}

    public void pegaDados(){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite sua altura em metros: ");
        altura = in.nextDouble();

        System.out.println("Digite seu peso em kg: ");
        peso = in.nextDouble();
    }

    public void calcula(){
        this.imc = this.peso / Math.pow(altura, 2);
        String obesidade;

        if(imc < 18.5){
            obesidade = "Abaixo do Peso";
        }else if(imc >= 18.5 && imc <= 24.9){
            obesidade = "Normal";
        }else if(imc >= 25 && imc <= 29.9){
            obesidade = "Sobrepeso";
        }else if(imc >= 30 && imc <= 34.9){
            obesidade = "Obesidade grau 1";
        }else if(imc >= 35 && imc <= 39.9){
            obesidade = "Obesidade grau 2";
        }else{
            obesidade = "Obesidade grau 3";
        }

        System.out.println("Seu IMC é " + imc + " e você está classificado como " + obesidade);
    }
}


