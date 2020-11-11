/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author ASUS
 */
public class Program {
     public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang ella = new Orang("ELLa");
        Orang amelia = new Orang("Amelia");
        
        ella.peliharaHewan(kucingKampung);
        amelia.peliharaHewan(lumbaLumba);
        
        ella.ajakPeliharaanJalanJalan();
        amelia.ajakPeliharaanJalanJalan();
    }
}
