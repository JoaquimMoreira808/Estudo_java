public class Main {
   public static void main(String[] args) throws java.io.IOException{
    
    Produto[] produtos = new Produto[100];
    int totalProdutos = 0;

    while (true) {

        System.out.println("\n1 - Adicionar Produto");
        System.out.println("2 - Ver Produto");
        System.out.println("3 - Excluir Produto");
        System.out.println("0 - Sair");

        int opcao = System.in.read() - 48;
        System.in.read();
        
        if (opcao == 1) {
            System.out.println("ID:");
        }
    }


    }
 
}

