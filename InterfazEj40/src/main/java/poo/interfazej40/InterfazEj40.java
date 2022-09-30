/*Encontrar la raíz cuadrada, el cuadrado y el cubo de un grupo de 
números enteros positivos*/

package poo.interfazej40;

public class InterfazEj40 {

    public static void main(String[] args) {
        Form40 fr = new Form40();
        fr.setVisible(true);
    }
}

class datos{
    public static double calcular_raiz(double a){
        return Math.sqrt(a);
    }
    public static double calcular_cuadrado (double a){
        return Math.pow(a,2);
    }
    public static double calcular_cubo(double a){
        return Math.pow(a,3);
    }
}