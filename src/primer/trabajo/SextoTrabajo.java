package primer.trabajo;

import java.util.Scanner;

public class SextoTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese 1 si tiene grados Fahrenheit o 2 si tiene grados centigrados");
        int respuesta=textoScanner.nextInt();
        
        if(respuesta==1){
            System.out.println("cantidad de grados Fahrenheit");
            double Fahrenheit = textoScanner.nextDouble();
            double resultado=(Fahrenheit-32)*0.5555555555555556;
            System.out.println("en grados centigrados es "+resultado);
        }else if(respuesta==2){
            
            System.out.println("cantidad de grados centigrados");
            double centigrados = textoScanner.nextDouble();
            double resultado=(centigrados*1.8)+32;
            System.out.println("en grados centigrados es "+resultado);
        }else System.out.println("no existe esa opcion");
    }
    
}
