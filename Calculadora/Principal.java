package Calculadora;

public class Principal {
    public static void main(String[] args) {

        // Calculadora HP = new Calculadora();
        CalculadoraAvancada EPSON = new CalculadoraAvancada();

        double resposta = EPSON.Somar(5, 3);

        System.out.println(resposta);

        EPSON.Guardar(resposta);

        resposta = EPSON.Subtrair(9, 5);

        System.out.println(resposta);

        System.out.println(EPSON.Multiplicar(resposta, EPSON.Recuperar()));

        resposta = EPSON.AreaRetangulo(10, 2);

        resposta = EPSON.VolumeCabo(7);
        {
            System.out.println("Volume: " + resposta);
        }

        resposta = EPSON.AreaCirculo(resposta);
        {
            System.out.println("Area Circulo: " + resposta);
        }

        resposta = EPSON.AreaTriangulo(resposta, resposta);
        {
            System.out.println("Area Triangulo: " + resposta);
        }

        resposta = EPSON.VolumeEsfera(resposta); {
            System.out.println("Volume Esfera: " + resposta);
        }
    }
}