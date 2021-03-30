package figuras;

public class Cuadrado extends Rectangulo {

    public Cuadrado(double lado){
        super(lado,lado);
    }

    @Override
    public String toString() {
        return ("\nCuadrado:\n Area=" + this.area() + " Superficie:" + this.superficie());
    }
}
