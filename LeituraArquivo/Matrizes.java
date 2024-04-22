package LeituraArquivo;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
    // Desenvolva um algoritmo que peça a coordenada x e y de um ponto e o valor do ângulo de rotação. No final mostre qual a nova coordenada (x2, y2) do ponto. 
    int x, y, anguloRotacao;

    Scanner sc = new Scanner(System.in);

       // Leitura das coordenadas x e y e do ângulo de rotação
       System.out.println("Digite a coordenada x do ponto:");
       x = sc.nextInt();
       System.out.println("Digite a coordenada y do ponto:");
       y = sc.nextInt();
       System.out.println("Digite o valor do ângulo de rotação em graus:");
       anguloRotacao = sc.nextInt();

       // 1. Conversão do ângulo de graus para radianos
       double anguloEmRadianos = Math.toRadians(anguloRotacao);

       // 2. Aplicando as fórmulas de rotação
       double x2 = x * Math.cos(anguloEmRadianos) - y * Math.sin(anguloEmRadianos);
       double y2 = x * Math.sin(anguloEmRadianos) + y * Math.cos(anguloEmRadianos);

       // 3. Mostrando os resultados
       System.out.printf("Nova coordenada (x2, y2): (%.2f, %.2f)%n", x2, y2);
       sc.close();
    }        
}
