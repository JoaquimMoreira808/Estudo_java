import java.io.BufferedReader;
import java.io.InputStreamReader;
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

    public static Produto getProductById(int id, Produto[] produtos) {
        for (Produto p : produtos) {
            if (p != null && p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
