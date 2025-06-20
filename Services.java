public class Services {
    

    public static String readLine() throws java.io.IOException {
        String linha = "";
        int c;
        while ((c = System.in.read()) != -1) {
            if (c == '\n' || c == '\r') break;
            linha += (char) c;
        }
        return linha.trim();
    }
    

    public static int readInt() throws java.io.IOException {
        return Integer.parseInt(readLine());
    }
    
}
