/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbalumba = new Ikan();
        
        Orang ani = new Orang ("Ani");
        Orang budi = new Orang("Budi");
        
        ani.peliharanHewan(kucingKampung);
        budi.peliharanHewan(lumbalumba);
        
        ani.ajakPeliharranJalanJalan();
        budi.ajakPeliharranJalanJalan();
    }
    
}
