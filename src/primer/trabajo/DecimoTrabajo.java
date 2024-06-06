package primer.trabajo;

import java.util.Scanner;

public class DecimoTrabajo {

    public static void main(String[] args) {
        Scanner texto=new Scanner(System.in);
        
        System.out.println("cuantas horas de trabajo son");
        int Horas=texto.nextInt();
        System.out.println("cunatos dias trabajo");
        int Dias=texto.nextInt();
        System.out.println("cuants horas extras trabajo");
        int HExtra=texto.nextInt();
        System.out.println("cuantos hijos tiene");
        int Hijo=texto.nextInt();
        
        int extra=HExtra*12000;
        int hijo= Hijo*25000;
        
        int dia=Horas*10000;
        int mes=dia*Dias;
        int sueldo=mes+extra+hijo;
        
        System.out.println("el sueldo que tiene es de "+sueldo);
    }
    
}
