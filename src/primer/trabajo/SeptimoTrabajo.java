package primer.trabajo;

import java.util.Scanner;

public class SeptimoTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        int contenedor=0,contenedor0=0;
        
        System.out.println("ingrese un valor");
        int numero=textoScanner.nextInt();
        System.out.println("ingrese otro");
        int numero1=textoScanner.nextInt();
                       
        contenedor=numero;
        contenedor0=numero1;
        
        numero=0;
        numero1=0;
        
        numero=contenedor0;
        numero1=contenedor;
        
        System.out.println("los valores son "+numero+" y "+numero1);
        
    }
    
}
