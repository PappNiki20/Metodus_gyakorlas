
package metodus_gyakorlas;

public class Metodus_gyakorlas {

    
    public static void main(String[] args) {
       
        osszead(2,3);
        kiir("Az első 10 szám összege: "+elso10szamosszege());
        kiir("Az ");
    }

    private static int elso10szamosszege() {
        int ossz = 0;
        for (int i = 0; i < 10; i++) {
            ossz += i;
            
        }
        return ossz;
    }

    private static int osszead(int a, int b) {
       int osszeaderedmeny = a+b;
        return osszeaderedmeny;
    }

    private static void kiir(String szoveg) {
        System.out.printf(szoveg);
    }
   
    
}
