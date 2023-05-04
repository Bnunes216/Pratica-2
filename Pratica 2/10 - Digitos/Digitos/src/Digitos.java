import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) throws Exception {
    Var eq = new Var(0, 0);

    System.out.println("Digite o numero da operação que deseja realizar: 1 - adição /  2 - multiplicação /  3 - Subtração /  4 - Divisão)");

    Scanner inf = new Scanner (System.in);
    int decisao;

    decisao = inf.nextInt();
    switch (decisao) {

        case 1:
        eq.soma();
        break;

        case 2:
        eq.multiplicacao();
        break;

        case 3:
        eq.comparacao();
        break;

        case 4:
        eq.divisao();
        break;

        default:
        System.out.println("Escolha Invalida! ");
   
    }
    }
}
