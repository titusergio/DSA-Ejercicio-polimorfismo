package figuras;

public class Triangulo extends Figura{

    double base;
    double altura;

    public Triangulo(double b, double a){
        base=b;
        altura=a;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public double superficie(){
        return (base+altura);
    }

    @Override
    public String toString() {
        return ("\nTriangulo:\n Area=" + this.area() +" Superficie=" + this.superficie());
    }
}
