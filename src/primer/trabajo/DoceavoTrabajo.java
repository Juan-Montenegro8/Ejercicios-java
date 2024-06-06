package primer.trabajo;

import java.util.Scanner;

public class DoceavoTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("escriba la cantidad de segundos");
        int segundos=textoScanner.nextInt();
        
        int horas=segundos/3600;
        int hora=segundos%3600;
        int minutos=hora/60;
        int segundo=hora%60;
        
        System.out.println(horas+" hora "+minutos+" minutos "+segundo+" segundos");
    }
    
}
