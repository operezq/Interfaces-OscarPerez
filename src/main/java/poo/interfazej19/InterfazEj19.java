/*Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el 
perímetro, el valor de la altura y el área del triángulo. */

package poo.interfazej19;

public class InterfazEj19 {

    public static void main(String[] args) {
        Form19 frame = new Form19();
        frame.setVisible(true);
    }
}

class triangulo{
    public static double perimetro(double a){
        double perimetro;
        perimetro = a*3;
        return perimetro;
    }
    public static double alt(double a){
        double altura = (Math.sqrt(3)*a)/2;
        return altura;
    }
    public static double areaa(double a){
        double area = (a*a)/2;
        return area;
    }
}