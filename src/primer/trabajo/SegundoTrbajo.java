package primer.trabajo;
import java.util.*;
public class SegundoTrbajo {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("de la medida en metros");
            double medida=textoScanner.nextDouble();
        
            double centimetros= medida*100;
            double pulgadas=centimetros/2.54;
            double pie = pulgadas/12;
            double yardas = pie/3;
        
            System.out.println("en cm es "+centimetros);
            System.out.println("en pulgadas es "+pulgadas);
            System.out.println("en pies es "+pie);
            System.out.println("en yardas es "+yardas); 
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
