

import java.util.Arrays;
import java.util.Comparator;

import java.util.Scanner;

import figuras.*;




public class GestorFiguras {


    public static void Ordenar(Figura[] f){
        Arrays.sort(f);
    }


    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        double base,altura;

        System.out.println("Ingrese la base del traingulo en cm:");
        base = leer.nextDouble();

        System.out.println("Ingrese la base del traingulo en cm:");
        altura = leer.nextDouble();

        Figura[] figuras = new Figura[3];

        figuras[0]= new Rectangulo(7,6);
        figuras[1]=  new Triangulo(base,altura);
        figuras[2]= new Circulo(3);

        System.out.println(Arrays.asList(figuras));
        Ordenar(figuras);
        System.out.println(Arrays.asList(figuras));









    }



}
