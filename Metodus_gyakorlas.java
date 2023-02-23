
package metodus_gyakorlas;



public class Metodus_gyakorlas {

    
    public static void main(String[] args) {
       
       int osszeg = osszead(1,2);
       int gyokosszeg =osszead(3,4); 
      kiir("Az első 10 szám összege: "+elso10szamosszege());
      kiir("\nNégy szám összege = %d".formatted(osszeg));
      kiir("\n gyöke: "+osszeggyok(gyokosszeg,4));
//      kiir("\n4 szám összege: "+negyszamosszeg(2,3,4,5));
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
        osszeaderedmeny =osszeaderedmeny+3;
        osszeaderedmeny = osszeaderedmeny+4;
        return osszeaderedmeny;
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }

//    private static int negyszamosszeg(int szam1,int szam2,int szam3,int szam4) {
//        int ossz = 0;
//        
//        int[] szamok = {szam1,szam2,szam3,szam4};
//        for (int i = 0; i < szamok.length; i++) {
//           ossz += szamok[i];
//            
//        }
//        return ossz;
//    }

    private static double osszeggyok(int ab ,int c) {
       double gyok = Math.sqrt(ab+c);
       return gyok;
    }
   
    
}
