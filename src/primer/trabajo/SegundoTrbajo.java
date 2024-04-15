package primer.trabajo;
import java.util.*;
public class SegundoTrbajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("de la medida en metros");
        double met=t.nextDouble();
        
        double centi= met*100;
        double pul=centi/2.54;
        double pie = pul/12;
        double yar = pie/3;
        
        System.out.println("en cm es "+centi);
        System.out.println("en pulgadas es "+pul);
        System.out.println("en pies es "+pie);
        System.out.println("en yardas es "+yar);        
    }
    
}
