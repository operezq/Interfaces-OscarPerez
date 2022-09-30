package poo.interfazej7;

public class Mayor {
    public static String mayor(double a,double b){
        if (a>b){
            return ("\n"+a+" es mayor que "+b);
        }
        else if (b>a){
            return ("\n"+b+" es mayor que "+a);
        }
        else{
            return ("\nLos números son iguales");
        }
    }
}