
package metodus_gyakorlas;




public class Szineskiiras {
    public static void main(String[] args) {
        equalizer(2);
        equalizer(4);
        equalizer();
        equalizer();
        equalizer(5);
    }

    private static void equalizer(int db) {
        for (int i = 0; i < db; i++) {
         int szam = (int) (Math.random () * ((7 -3) +1) + 3);
         String szin ="\u001B[45m";
          for (int j = 0; j < szam; j++) {
               System.out.print( szin + " ");
        }
          System.out.println("");
    }
    }
     private static void equalizer() {
        for (int i = 0; i < 5; i++) {
         int szam = (int) (Math.random () * ((7 -3) +1) + 3);
         String szin ="\u001B[45m";
          for (int j = 0; j < szam; j++) {
               System.out.print( szin + " ");
        }
          System.out.println("");
    }
    }
}
