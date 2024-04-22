package LeituraArquivo;
import java.util.Scanner;

public class GerenciadorDeNotas {
    public static void main(String[] args) {
        final int NUMERO_DE_ALUNOS = 200;
        final int NUMERO_DE_NOTAS = 10;
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[NUMERO_DE_ALUNOS];
        double[][] notas = new double[NUMERO_DE_ALUNOS][NUMERO_DE_NOTAS];
        
        // Coleta de dados
        for (int i = 0; i < NUMERO_DE_ALUNOS; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
            
            for (int j = 0; j < NUMERO_DE_NOTAS; j++) {
                System.out.println("Nota " + (j + 1) + " para " + nomes[i] + ":");
                notas[i][j] = scanner.nextDouble();
                // Limpa o buffer do scanner após a última leitura de nota
                if (j == NUMERO_DE_NOTAS - 1) {
                    scanner.nextLine();
                }
            }
        }
        
        // Cálculo das médias e determinação do status
        for (int i = 0; i < NUMERO_DE_ALUNOS; i++) {
            double soma = 0;
            for (int j = 0; j < NUMERO_DE_NOTAS; j++) {
                soma += notas[i][j];
            }
            double media = soma / NUMERO_DE_NOTAS;
            char status;
            
            if (media >= 7) {
                status = 'A'; // Aprovado
            } else if (media >= 5) {
                status = 'E'; // Exame
            } else {
                status = 'R'; // Reprovado
            }
            
            System.out.printf("%s %.1f %c%n", nomes[i], media, status);
            scanner.close();
        }
    }
}
