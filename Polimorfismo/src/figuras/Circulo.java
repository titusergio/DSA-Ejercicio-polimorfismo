package figuras;

public class Circulo extends Figura {

    private double radio;
    public Circulo(double r){
        radio = r;
    }

    public double area(){
        return (Math.PI * Math.pow(radio,2));
    }

    public double superficie(){
        return (2 * Math.PI * radio);
    }

    @Override
    public String toString(){

        return ("\nCirculo:\n Area=" +  this.area() + " Superficie=" + this.superficie());
    }






}
