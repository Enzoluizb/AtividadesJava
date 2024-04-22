package Calculadora;

public class Calculadora {

    double memoria;
    double v1;
    double v2;

    public void Guardar(double n) {
        this.memoria = n;
    }

    public double Recuperar() {
        return this.memoria;
    }

    public double Somar(
            double v1,
            double v2) {
        return (v1 + v2);
    }

    public double Subtrair(
            double v1,
            double v2) {
        return (v1 - v2);
    }

    public double Multiplicar(
            double v1,
            double v2) {
        return (v1 * v2);
    }

    public double Dividir(
            double v1,
            double v2) {
        return (v1 / v2);
    }
}