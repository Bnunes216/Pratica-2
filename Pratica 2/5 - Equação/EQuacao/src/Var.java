import java.util.Scanner;
public class Var {
    
    //Variavel
    double x;

    //Gets e Sets
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    //Construtores
    public Var(double x) {
        this.x = x;
    }

    public void executa() {
        Scanner entrada = new Scanner(System.in);
        int confirmacao;

        do{

        Capturadados();
        Calcula(x);

        System.out.println("\n\n\nDeseja executar o programa novamente? (0 = não / 1 = sim)");
        confirmacao = entrada.nextInt();
        } while (confirmacao == 1);
         entrada.close();
    }

    public void Capturadados(){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor para x: ");
        x = in.nextDouble();
    }

    public static double Calcula (double x) {
            if (x < -2) {
                return 2 * x - 2;
            } else if (x < 3) {
                return 3;
            } else {
                return -x;
            }
        }
    }
