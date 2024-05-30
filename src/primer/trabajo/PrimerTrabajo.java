package primer.trabajo;
import java.util.*;
public class PrimerTrabajo {

    public static void main(String[] args) {
        Scanner texto= new Scanner(System.in);
        
        System.out.println("ingrese la base del rectangulo");
        double base=texto.nextDouble();
        System.out.println("ingrese la altura del rectangulo");
        double altura=texto.nextDouble();
        
        double area = base*altura;
        double perimetro = 2*(base+altura);
        System.out.println("el area es "+area);
        System.out.println("el perimetro es "+perimetro);
    }
    
}
