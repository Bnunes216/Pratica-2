import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int confirmacao;
    
    do{System.out.println("\nBem vindo, gostaria de saber sobre qual Git? (1 - gitclone / 2 - gitfetch / 3 - gitpull / 4 - Sair" );
       
    confirmacao = in.nextInt();
    switch (confirmacao) {
        
        case 1: gitclone();
        break;

        case 2: gitfetch();
        break;

        case 3: gitpull();
        break;

        default: System.out.println("Escolha Invalida! ");

    }
        
     
    }while(confirmacao != 4);
}

    private static void gitclone() {
        System.out.println("É um comando utilizado no Git, que é um sistema de controle de versão amplamente utilizado para gerenciar o código fonte de projetos de software.");
        System.out.println("A sintaxe do comando é a seguinte: git clone <URL do repositório> ");
    }

    private static void gitfetch() {
       System.out.println("É utilizado no Git para buscar as atualizações mais recentes de um repositório remoto, sem aplicar essas atualizações ao seu repositório local. ");
       System.out.println("É a sintaxe básica do comando é a seguinte: git fetch <nome-do-remoto> ");
    }

    private static void gitpull() {
        System.out.println("É utilizado no Git para buscar as atualizações mais recentes de um repositório remoto e aplicá-las ao seu repositório local, atualizando assim o seu código local para a versão mais recente disponível.");
        System.out.println("A sintaxe básica do comando é a seguinte: git pull <nome-do-remoto> <nome-da-branch> ");

    }


}