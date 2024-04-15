package primer.trabajo;
import java.util.*;
public class PrimerTrabajo {

    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        double b,a;
        System.out.println("ingrese la base del rectangulo");
        b=t.nextDouble();
        System.out.println("ingrese la altura del rectangulo");
        a=t.nextDouble();
        
        double area = b*a;
        double peri = 2*(b+a);
        System.out.println("el area es "+area);
        System.out.println("el perimetro es "+peri);
    }
    
}
