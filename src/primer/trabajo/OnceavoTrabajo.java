package primer.trabajo;

import java.util.Scanner;

public class OnceavoTrabajo {

    public static void main(String[] args) {
        Scanner texto=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int numero1=texto.nextInt();
        System.out.println("el otro");
        int numero2=texto.nextInt();
        
        int respuesta1=numero1%10;
        int respuesta2=numero2%10;
        
        int respuesta3=numero1-respuesta1;
        int respuesta4=numero2-respuesta2;
        
        int respuesta5=respuesta3+respuesta2;
        int respuesta6=respuesta4+respuesta1;
        
        System.out.println(""+respuesta5);
        System.out.println(""+respuesta6);
    }
    
}
