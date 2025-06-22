import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Services {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() throws IOException {
        return reader.readLine().trim();
    }

    public static int readInt() throws IOException {
        while (true) {
            String line = readLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
            }
        }
    }

    public static Produto getProductById(int id, ArrayList<Produto> produtos) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static Produto getExpensiveProduct(ArrayList<Produto> produtos) {
        Produto mostExpensive = produtos.get(0);
    
        for (Produto p: produtos) {
            if(p.getPreco() > mostExpensive.getPreco()){
                mostExpensive = p;
            }
        }
        return mostExpensive;

    }

    public static double readDouble() throws java.io.IOException {
        while (true) {
            String line = readLine();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número decimal (ex: 25.50): ");
            }
        }
    }

}
