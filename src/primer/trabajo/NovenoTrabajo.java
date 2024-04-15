package primer.trabajo;

import java.util.Scanner;

public class NovenoTrabajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        int j=0;
        for(int i=1;i<4;i++){
            System.out.println("ingresa el valor de la venta");
            int v=t.nextInt();
            j=j+v;
        }
        
        double por=j*0.12;
        double fin=por+680000;
        
        System.out.println("el sueldo del mes fue de: "+fin);
    }
    
}
