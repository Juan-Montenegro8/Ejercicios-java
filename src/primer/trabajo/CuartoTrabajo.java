package primer.trabajo;
import java.util.*;
public class CuartoTrabajo {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        
        System.out.println("ingrese un numero de 4 cifras");
        int numero=texto.nextInt();
                
        if((numero>=1000) && (numero<=9999)){
            
            System.out.println("el numero en unidades de mil seria "+numero);
            int numemro1=numero%1000;
            System.out.println("el numero en centenas seria "+numemro1);
            int nummero2=numemro1%100;
            System.out.println("el numero en decenas seria "+nummero2);
            int numero3=nummero2%10;
            System.out.println("el numero en unidades seria "+numero3);
            
        }else{
            System.out.println("no es numero de cuatro cifras positivo");
        }
    }
    
}
