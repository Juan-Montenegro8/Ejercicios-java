package primer.trabajo;

import java.util.Scanner;

public class OctavoTabajo {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("escriba cuantos GB tiene su disco duro");
        double GigaByte=textoScanner.nextDouble();
        
        double MegaByte = GigaByte*1024;
        double KiloByte = MegaByte*1024;
        double Byte = KiloByte*1024;
        
        System.out.println("en megabytes"+MegaByte);
        System.out.println("en kilobytes"+KiloByte);
        System.out.println("en bytes"+Byte);
    }
    
}
