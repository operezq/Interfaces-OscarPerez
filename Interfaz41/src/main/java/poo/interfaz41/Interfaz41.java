/*Elaborar un algoritmo que encuentre el mayor valor entre 
un grupo de datos positivos*/

package poo.interfaz41;
import javax.swing.JOptionPane;

public class Interfaz41 {

    public static void main(String[] args) {
        int entrada = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números va a introducir?"));
        int array[] = new int[entrada];
        double mayor=0;
        for (int i=0; i<entrada;i++){
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Número "+(i+1)+": "));
        }
        for (int i=0;i<entrada;i++){
            if (array[i]>mayor){
                mayor = array[i];
            }
        }
        JOptionPane.showMessageDialog(null,"El número mayor es: "+mayor);
    }
}
