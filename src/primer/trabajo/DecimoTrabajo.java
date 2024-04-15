package primer.trabajo;

import java.util.Scanner;

public class DecimoTrabajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("cuantas horas de trabajo son");
        int horas=t.nextInt();
        System.out.println("cunatos dias trabajo");
        int dias=t.nextInt();
        System.out.println("cuants horas extras trabajo");
        int extra=t.nextInt();
        System.out.println("cuantos hijos tiene");
        int hijo=t.nextInt();
        
        int extra1=extra*12000;
        int hijo1= hijo*25000;
        
        int dia=horas*10000;
        int mes=dia*dias;
        int demas=mes+extra1+hijo1;
        
        System.out.println("el sueldo que tiene es de "+demas);
    }
    
}
