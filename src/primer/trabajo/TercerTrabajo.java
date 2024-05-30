//50% pa salud --- 30% pa comedor --- 20% pa admin
//preguntar al profe los montos 
package primer.trabajo;
import java.util.*;
public class TercerTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner= new Scanner(System.in);
        
        System.out.println("ingrese monto en dolares que donaron");
        double dolares=textoScanner.nextDouble();
        System.out.println("ingrese monto en euros que donaron");
        double euros=textoScanner.nextDouble();
        
        double peso1=dolares*2000;
        double peso2=euros*2800;
        
        double peso=peso1+peso2;
        
        System.out.println("Monto total en peso"+peso);
        
        double salud = peso*0.5;
        double comedor = peso*0.3;
        double administrativos = peso*0.2;
        
        System.out.println("Monto correspondiente a salud "+salud);
        System.out.println("Monto correspondinte al comedor de los niños "+comedor);
        System.out.println("Monto correspondiente a gastos administrativos "+administrativos);
    }
    
}
