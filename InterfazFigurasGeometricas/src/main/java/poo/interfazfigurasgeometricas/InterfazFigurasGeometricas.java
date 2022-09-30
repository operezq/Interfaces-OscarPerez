/*Se requiere un programa que modele varias figuras geométricas: el círculo, 
el rectángulo, el cuadrado y el triángulo rectángulo.
u El círculo tiene como atributo su radio en centímetros.
u El rectángulo, su base y altura en centímetros.
u El cuadrado, la longitud de sus lados en centímetros.
u El triángulo, su base y altura en centímetros.

Se requieren métodos para determinar el área y el perímetro de cada 
figura geométrica. Además, para el triángulo rectángulo se requiere:
u Un método que calcule la hipotenusa del rectángulo.
u Un método para determinar qué tipo de triángulo es:
Equilátero: todos sus lados son iguales.
Isósceles: tiene dos lados iguales.
Escaleno: todos sus lados son diferentes.*/
package poo.interfazfigurasgeometricas;
import javax.swing.JOptionPane;
public class InterfazFigurasGeometricas {

    public static void main(String[] args) {
        FormFiguras fr = new FormFiguras();
        fr.setVisible(true);
        JOptionPane.showMessageDialog(null,"¡¡¡MODELAMIENTO DE FIGURAS GEOMÉTRICAS!!!");    
        JOptionPane.showMessageDialog(null,"Oprima el botón de la figura que quiere calcular.");

    }
}

class circulo{
       int radio;
        circulo(int radio){
        this.radio = radio;
    }
         public static double calcularArea(double radio){
            return Math.PI*Math.pow(radio,2);
    }
        public static double calcularPerimetro(double radio){
            return 2*Math.PI*radio;
        }
}
class rectangulo{
    int base,altura;
    rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
        public static double calcularArea(double base, double altura){
            return base*altura;
        }
        public static double calcularPerimetro(double base, double altura){
            return base*2+altura*2;
        }
}
class cuadrado{
    int lado;
    cuadrado(int lado){
        this.lado = lado;
    }
        public static double calcularArea(double lado){
            return Math.pow(lado,2);
        }
        public static double calcularPerimetro(double lado){
            return lado*4;
        }
}
class triangulo{
    int base,altura;
        public static double calcularHipotenusa(double base,double altura) {
            return Math.pow(base*base + altura*altura, 0.5);
                }
        public static double calcularArea(double base, double altura){
            return base*altura/2;
        }
        public static double calcularPerimetro(double base, double altura){
            return base+altura+calcularHipotenusa(base,altura);
        }
        public static String determinarTipoTriangulo(double base,double altura) {
            if ((base == altura) && (base == calcularHipotenusa(base,altura)) && (altura == calcularHipotenusa(base,altura)))
            return ("Equilátero"); /* Todos sus 
            lados son iguales */
            else if ((base != altura) && (base != calcularHipotenusa(base,altura)) && (altura != calcularHipotenusa(base,altura)))
            return ("Escaleno"); /* Todos sus 
            lados son diferentes */
            else 
            return ("Isósceles"); /* De otra 
            manera, es isósceles */
    }
}