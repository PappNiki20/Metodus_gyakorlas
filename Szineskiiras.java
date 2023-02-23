
package metodus_gyakorlas;




public class Szineskiiras {
    
   static int szam = (int) (Math.random () * ((7 -3) +1) + 3);
   static String szin ="\u001B[45m";
    public static void main(String[] args) {
        equalizer(2);
        equalizer(4);
        equalizer();
        equalizer(true);
        equalizer(5,true);
    }

   private static void equalizer(int db) {
        equalizer(db,false);
          for (int j = 0; j < db; j++) {
               System.out.print( szin + " ");
        }
          System.out.println("");
    
    }
    private static void equalizer() {
       
         equalizer(false);
    
    }
     
    private static void equalizer(boolean latni) {
        equalizer(szam = (int) (Math.random () * ((7 -3) +1) + 3), latni);
    }
     private static void equalizer(int db, boolean latni) {
        String szoveg = "\u001B[45m" + " ";
        String rajzol = "";
        
        int i = 0;
         for ( i = 0; i < db; i++) {
             rajzol += szoveg;
         }
        if (latni == true){
            System.out.println(rajzol + "\u001B[0m (%d)".formatted(i));
        } else{
            System.out.println(rajzol);
        }
       
     }
    
}
