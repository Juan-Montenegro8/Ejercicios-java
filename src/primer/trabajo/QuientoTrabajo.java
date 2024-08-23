package primer.trabajo;

import java.util.Scanner;

public class QuientoTrabajo {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese la cantidad de hombres en el salon");
            double hombres=textoScanner.nextDouble();
            System.out.println("ingrese la cantidad de mujeres en el salon");
            double mujeres=textoScanner.nextDouble();
        
            double cantidad=hombres+mujeres;
        
            double porcentajeHombres=(100*hombres)/cantidad;
            double porcentajeMujeres=(100*mujeres)/cantidad;
        
            System.out.println("la cantidad de hombres es del "+porcentajeHombres+"%");
            System.out.println("la cantidad de mujeres es del "+porcentajeMujeres+"%");
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e.getMessage());
        }
    }
    
}
