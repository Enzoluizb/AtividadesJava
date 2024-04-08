import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraArquivo {

    public static void main(String[] args) {
        
        String arquivo = "src/funcionarios.csv";
        String linha = "";

        BufferedReader leitor;

        try {
            leitor = new BufferedReader(new FileReader(arquivo));
            linha = leitor.readLine();
            System.out.println(linha);
            leitor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}