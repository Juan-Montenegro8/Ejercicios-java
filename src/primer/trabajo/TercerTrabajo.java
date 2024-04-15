//50% pa salud --- 30% pa comedor --- 20% pa admin
//preguntar al profe los montos 
package primer.trabajo;
import java.util.*;
public class TercerTrabajo {

    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        
        System.out.println("ingrese monto en dolares que donaron");
        double dol=t.nextDouble();
        System.out.println("ingrese monto en euros que donaron");
        double eur=t.nextDouble();
        
        double pes1=dol*2000;
        double pes2=eur*2800;
        
        double peso=pes1+pes2;
        
        System.out.println("Monto total en peso"+peso);
        
        double salud = peso*0.5;
        double comedor = peso*0.3;
        double admin = peso*0.2;
        
        System.out.println("Monto correspondiente a salud "+salud);
        System.out.println("Monto correspondinte al comedor de los niños "+comedor);
        System.out.println("Monto correspondiente a gastos administrativos "+admin);
    }
    
}
