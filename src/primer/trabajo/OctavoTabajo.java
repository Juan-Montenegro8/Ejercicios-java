package primer.trabajo;

import java.util.Scanner;

public class OctavoTabajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("escriba cuantos GB tiene su disco duro");
        double gb=t.nextDouble();
        
        double mb = gb*1024;
        double kb = mb*1024;
        double b = kb*1024;
        
        System.out.println("en megabytes"+mb);
        System.out.println("en kilobytes"+kb);
        System.out.println("en bytes"+b);
    }
    
}
