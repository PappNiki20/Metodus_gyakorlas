
package metodus_gyakorlas;

import java.util.Random;

public class Qrkodkeszito {
    public static void main(String[] args) {
          
        qr();
        qr();
         qr();
       
    }

    private static void qr() {
          Random rd = new Random();
        for (int i = 0; i < 10; i++) {
         boolean szam = rd.nextBoolean();
         
        
         String szin ="\u001B[45m";
         String szin2 ="";
          
         if (szam == true){
              System.out.print( szin + " ");
              
         }
              
         else{
             System.out.print( szin2 + " ");
         }
         System.out.println("");
    
    }
    } 
}
