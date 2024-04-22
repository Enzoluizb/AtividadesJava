package Calculadora;

public class CalculadoraAvancada extends Calculadora {

    double area, volume, altura, raio;

    public double AreaRetangulo(double base, double altura) {
        this.area = base * altura;
        return this.area;
    }

    public double VolumeCabo(double profundidade) {
        this.area = profundidade * altura;
        return this.area;
    }

    public double AreaTriangulo(double base, double altura) {
        this.area = (base*altura)/2;
        return this.area;
    }

    public double AreaCirculo(double raio) {
        this.area = Math.PI * Math.pow(raio, 2);
        return this.area;
    }

    public double VolumePiramide(double altura) {
        return (this.area * altura)/3;
    }

    public double VolumeEsfera(double raio) {
        this.volume = (4/3) * Math.PI * Math.pow(raio, 3);
        return this.volume;
    }
}
