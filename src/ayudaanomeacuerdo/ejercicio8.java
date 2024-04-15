package ayudaanomeacuerdo;
import java.util.*;
public class ejercicio8 {

    public static void main(String[] args) {
        Random ale=new Random();
        Scanner tec= new Scanner(System.in);
        int vec []=new int[100];
        for (int i = 0; i < 100; i++) {
            vec[i]=ale.nextInt(100);
        }
        System.out.println("los valores ramdon fueros:");
        for (int i = 0; i < 90; i++) {
            System.out.print(vec[i]+" ");
        }
        System.out.println();
        System.out.println("escriba un numero:");
        int numero =tec.nextInt();
        int cont=0;
        for (int i = 0; i < 100; i++) {
            if(vec[i]==numero){
                cont++;
            }
        }
        System.out.println("el numero de veces que se repitio el numero "+numero+" es: "+cont);
    }
    
}
