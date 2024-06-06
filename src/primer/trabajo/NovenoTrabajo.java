package primer.trabajo;

import java.util.Scanner;

public class NovenoTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        int contenedor=0;
        for(int i=1;i<4;i++){
            System.out.println("ingresa el valor de la venta");
            int venta=textoScanner.nextInt();
            contenedor=contenedor+venta;
        }
        
        double porcentaje=contenedor*0.12;
        double sueldo=porcentaje+680000;
        
        System.out.println("el sueldo del mes fue de: "+sueldo);
    }
    
}
