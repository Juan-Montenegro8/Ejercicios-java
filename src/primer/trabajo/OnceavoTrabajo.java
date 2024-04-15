package primer.trabajo;

import java.util.Scanner;

public class OnceavoTrabajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n1=t.nextInt();
        System.out.println("el otro");
        int n2=t.nextInt();
        
        int r1=n1%10;
        int r2=n2%10;
        
        int r3=n1-r1;
        int r4=n2-r2;
        
        int r5=r3+r2;
        int r6=r4+r1;
        
        System.out.println(""+r5);
        System.out.println(""+r6);
    }
    
}
