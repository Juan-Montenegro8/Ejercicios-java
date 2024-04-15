package primer.trabajo;

import java.util.Scanner;

public class QuientoTrabajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de hombres en el salon");
        double h=t.nextDouble();
        System.out.println("ingrese la cantidad de mujeres en el salon");
        double m=t.nextDouble();
        
        double cant=h+m;
        
        double porh=(100*h)/cant;
        double porm=(100*m)/cant;
        
        System.out.println("la cantidad de hombres es del "+porh+"%");
        System.out.println("la cantidad de mujeres es del "+porm+"%");
    }
    
}
