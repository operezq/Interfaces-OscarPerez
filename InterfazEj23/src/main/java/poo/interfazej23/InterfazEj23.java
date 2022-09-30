/*Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado, 
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación*/
package poo.interfazej23;

public class InterfazEj23 {

    public static void main(String[] args) {
        Form23 fr = new Form23();
        fr.setVisible(true);
    }

}
   class resultados {
        public static double ecuacion1(double a,double b, double c){
        return (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
        public static double ecuacion2(double a, double b,double c){
        return (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
    }