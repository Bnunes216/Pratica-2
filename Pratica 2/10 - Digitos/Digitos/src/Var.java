import java.util.Scanner;

public class Var {
   
//Variavel  
double x;
double y;

 //Gets e Sets  
public double getX() {
    return x;
}

public void setX(double x) {
    this.x = x;
}

public double getY() {
    return y;
}

public void setY(double y) {
    this.y = y;
}

//Construtor
public Var(double x, double y) {
    this.x = x;
    this.y = y;
} 

//Metodos
public void soma () {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Insira o primeiro digito: ");
    x = in.nextDouble();
    
    System.out.println("Insira o segundo digito: ");
    y = in.nextDouble();

    double soma;
    double resultado = x + y;
  
    System.out.println("O resultado da soma é: " + resultado);
}

public void multiplicacao(){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o primeiro digito: ");
    x = scanner.nextDouble();
    
    System.out.println("Insira o segundo digito: ");
    y = scanner.nextDouble();
   
    double resultado = x * y;
  
    System.out.println("O resultado da multiplicação é: " + resultado);
  }

public void comparacao(){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o primeiro digito: ");
    x = scanner.nextDouble();
    
    System.out.println("Insira o segundo digito: ");
    y = scanner.nextDouble();

    if (x == y) {
      System.out.println("Não é possível realizar a subtração, pois os valores são iguais.");
      System.out.println("O resultado da subtração é 0.");
    } else {
      double maior = Math.max(x, y);
      double menor = Math.min(x, y);

      double resultado = maior - menor;

      System.out.println("O resultado da subtração do maior pelo menor é: " + resultado);
    }

    scanner.close();
}

public void divisao (){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o primeiro digito: ");
    x = scanner.nextDouble();
    
    System.out.println("Insira o segundo digito: ");
    y = scanner.nextDouble();

    if (y == 0) {
        System.out.println("Não é possível realizar a divisão por zero.");
      } else {
        double resultado = x / y;
  
        System.out.println("O resultado da divisão é: " + resultado);
      }
  
      scanner.close();
    }
}
