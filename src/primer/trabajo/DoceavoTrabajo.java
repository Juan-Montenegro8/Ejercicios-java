package primer.trabajo;

import java.util.Scanner;

public class DoceavoTrabajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("escriba la cantidad de segundos");
        int seg=t.nextInt();
        
        int horas=seg/3600;
        int h=seg%3600;
        int min=h/60;
        int segun=h%60;
        
        System.out.println(horas+" hora "+min+" minutos "+segun+" segundos");
    }
    
}
