package ayudaanomeacuerdo;
import java.util.*;
public class ejercicio8 {

    public static void main(String[] args) {
        Random aleatorio=new Random();
        Scanner texto= new Scanner(System.in);
        int vector []=new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i]=aleatorio.nextInt(100);
        }
        System.out.println("los valores ramdon fueros:");
        for (int i = 0; i < 90; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println();
        System.out.println("escriba el numero que quiere encontrar:");
        int numero =texto.nextInt();
        int contador=0;
        for (int i = 0; i < 100; i++) {
            if(vector[i]==numero){
                contador++;
            }
        }
        System.out.println("el numero de veces que se repitio el numero "+numero+" es: "+contador);
    }
    
}
