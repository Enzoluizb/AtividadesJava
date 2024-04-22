package Calculadora;

public class Principal {
    public static void main(String[] args) {
        
        Calculadora HP = new Calculadora();

        double resposta = HP.Somar(5, 3);

        System.out.println(resposta);

        HP.Guardar(resposta);

        resposta = HP.Subtrair(9, 5);

        System.out.println(resposta);

        System.out.println(HP.Multiplicar(resposta, HP.Recuperar()));
    }
}