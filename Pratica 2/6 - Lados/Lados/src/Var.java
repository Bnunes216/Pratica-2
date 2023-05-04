import java.util.Scanner;

public class Var {
    
    //Variavel
    static double x;
    static double y;
    static double z;

    public Var(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    //Construtores
    public void executa (){
    Scanner entrada = new Scanner(System.in);
     int confirmacao;
        
     do{

        Capturadados();
        Calcula();

        System.out.println("\n\n\nDeseja executar o programa novamente? (0 = não / 1 = sim)");
        confirmacao = entrada.nextInt();
        } while (confirmacao == 1);
         entrada.close();
    }

    public void Capturadados(){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor do lado X: ");
        double x = in.nextDouble();

        System.out.print("Informe o valor do lado Y: ");
        double y = in.nextDouble();

        System.out.print("Informe o valor do lado Z: ");
        double z = in.nextDouble();
    }

    public static double Calcula () {
    Scanner in = new Scanner(System.in);

        if (x <= 0 || y <= 0 || z <= 0) {
            System.out.println("Erro: os valores dos lados devem ser maiores que zero.");
        } else if (x >= y + z || y >= x + z || z >= x + y) {
            System.out.println("Erro: os valores informados não formam um triângulo.");
        } else if (Math.abs(y - z) >= x || Math.abs(x - z) >= y || Math.abs(x - y) >= z) {
            System.out.println("Erro: os valores informados não formam um triângulo.");
        } else {
            System.out.println("Os valores informados podem formar um triângulo.");
        }

        in.close();
        return x;
}
}
