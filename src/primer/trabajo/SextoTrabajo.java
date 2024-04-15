package primer.trabajo;

import java.util.Scanner;

public class SextoTrabajo {

    public static void main(String[] args) {
        Scanner t =new Scanner(System.in);
        
        System.out.println("ingrese 1 si tiene grados Fahrenheit o 2 si tiene grados centigrados");
        int jj=t.nextInt();
        
        if(jj==1){
            System.out.println("cantidad de grados Fahrenheit");
            double f = t.nextDouble();
            double re=(f-32)*0.5555555555555556;
            System.out.println("en grados centigrados es "+re);
        }else{
            if(jj==2){
                System.out.println("cantidad de grados centigrados");
                double g = t.nextDouble();
                double re=(g*1.8)+32;
                System.out.println("en grados centigrados es "+re);
            }else{
                System.out.println("no existe esa opcion");
            }
        }
    }
    
}
