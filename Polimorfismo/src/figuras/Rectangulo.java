package figuras;

public class Rectangulo extends Figura{

    private double lado1, lado2;

    public Rectangulo(double l1, double l2){
        lado1 = l1;
        lado2 = l2;

    }




    @Override
    public double area() {
        return (lado1*lado2);
    }

    @Override
    public double superficie() {
        return (lado1*2 + lado2*2);
    }

    @Override
    public String toString() {
        return ("\nRectangulo:\n Area=" + this.area() + " Superficie=" + this.superficie());
    }
}
