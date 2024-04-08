import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraArquivo {

    public static void main(String[] args) {
        
        String arquivo = "src/funcionarios.csv";
        String linha = "";

        BufferedReader leitor;

        try {
            leitor = new BufferedReader(new FileReader(arquivo));
            linha = leitor.readLine(); // cabecalho
            linha = leitor.readLine(); // proxima linha
            while (linha != null) {
                System.out.println(linha); // imprime
                linha = leitor.readLine(); // le a proxima linha
            }
            leitor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}