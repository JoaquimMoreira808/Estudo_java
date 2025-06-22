import java.util.ArrayList;

public class Main {
   public static void main(String[] args) throws java.io.IOException {

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Arroz", 20.0, "Pacote 5kg"));
        produtos.add(new Produto(2, "Feijão", 10.0, "Pacote 1kg"));
        produtos.add(new Produto(3, "Macarrão", 8.5, "Pacote 500g"));
        produtos.add(new Produto(4, "Açúcar", 5.0, "Pacote 1kg"));
        produtos.add(new Produto(5, "Sal", 3.0, "Pacote 1kg"));
        produtos.add(new Produto(6, "Óleo de soja", 7.5, "Garrafa 900ml"));
        produtos.add(new Produto(7, "Leite", 4.2, "Caixa 1L"));
        produtos.add(new Produto(8, "Café", 15.0, "Pacote 500g"));
        produtos.add(new Produto(9, "Pão", 6.0, "Pacote 400g"));
        produtos.add(new Produto(10, "Manteiga", 12.0, "Pote 200g"));

        int escolha = 0;

        do {
            System.out.println("1. Ver produto");
            System.out.println("2. Cadastrar produto");
            System.out.println("3. Excluir produto");
            System.out.println("4. Editar produto");
            System.out.println("0. Sair");

            System.out.print("Escolha: ");
            escolha = Services.readInt();

            if (escolha == 1) {
                System.out.print("Digite o ID do produto: ");
                int id = Services.readInt();

                Produto produtoAtual = Services.getProductById(id, produtos);

                if (produtoAtual != null) {
                    System.out.println("Nome: " + produtoAtual.getNome());
                    System.out.println("Descrição: " + produtoAtual.getDescricao());
                    System.out.println("Preço: R$" + produtoAtual.getPreco());
                } else {
                    System.out.println("Produto não encontrado.");
                }
            } else if (escolha == 2) {

                int ultimoId = 0;

                for (Produto p : produtos) {
                    if (p != null && p.getId() > ultimoId) {
                        ultimoId = p.getId();
                    }
                }

                int novoId = ultimoId + 1;
        
                System.out.println("Nome do produto:");
                String novoNome = Services.readLine();

                System.out.println("Descricao:");
                String novaDesc = Services.readLine();

                System.out.println("Preço:");
                double novoPreco = Services.readDouble();

                Produto novoProduto = new Produto(novoId, novoNome, novoPreco, novaDesc);

                produtos.add(novoProduto);
            }

        } while (escolha != 0);

        System.out.println("Sistema encerrado.");
    }
}
