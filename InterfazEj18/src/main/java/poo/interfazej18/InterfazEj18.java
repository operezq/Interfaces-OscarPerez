/*Se tiene la siguiente información de un empleado: 
 · código del empleado, 
 · nombres, 
 · número de horas trabajadas al mes, 
 · valor hora trabajada, 
 · porcentaje de retención en la fuente. 
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto. */

package poo.interfazej18;
public class InterfazEj18 {

    public static void main(String[] args) {
        Form18 fr = new Form18();
        fr.setVisible(true);
    }
}

class salarios{
    public static double salarioBruto(double horas, double valorhora){
        return horas*valorhora;
    }
    public static double salarioNeto(double horas, double valorhora,double retencion) {
        retencion /=100;
        return salarios.salarioBruto(horas, valorhora) - salarios.salarioBruto(horas, valorhora)*retencion;
}
}
