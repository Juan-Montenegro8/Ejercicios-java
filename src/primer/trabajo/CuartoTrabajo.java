package primer.trabajo;
import java.util.*;
public class CuartoTrabajo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("ingrese un numero de 4 cifras");
        int num=t.nextInt();
                
        if((num>=1000) && (num<=9999)){
            
            System.out.println("el numero en unidades de mil seria "+num);
            int num1=num%1000;
            System.out.println("el numero en centenas seria "+num1);
            int num2=num1%100;
            System.out.println("el numero en decenas seria "+num2);
            int num3=num2%10;
            System.out.println("el numero en unidades seria "+num3);
            
        }else{
            System.out.println("no es numero de cuatro cifras positivo");
        }
    }
    
}
