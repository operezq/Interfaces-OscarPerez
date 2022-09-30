/*Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los 
siguientes datos: 
• Número de inscripción 
• Nombres 
• Patrimonio. 
• Estrato social. 
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio 
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3% 
sobre el patrimonio. Hacer un algoritmo que muestre: 
• Número de inscripción. 
• Nombres. 
• Pago de matrícula. */
package poo.interfazej10;
public class InterfazEj10 {

    public static void main(String[] args) {
        Form10 fr = new Form10();
        fr.setVisible(true);
    }
}
class estudiante{
    public static double matricula(int patrimonio,int estrato){
        if (patrimonio>2000000 && estrato>3){
            return 50000+patrimonio*0.03;
        }
        else {
            return 50000;
        }
    }
}
