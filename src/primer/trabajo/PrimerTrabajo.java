package primer.trabajo;
import java.util.*;
public class PrimerTrabajo {

    public static void main(String[] args) {
        try (Scanner textoScanner= new Scanner(System.in)){
            
            System.out.println("ingrese la base del rectangulo");
            double base=textoScanner.nextDouble();
            System.out.println("ingrese la altura del rectangulo");
            double altura=textoScanner.nextDouble();
        
            double area = base*altura;
            double perimetro = 2*(base+altura);
            System.out.println("el area es "+area);
            System.out.println("el perimetro es "+perimetro);

        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
