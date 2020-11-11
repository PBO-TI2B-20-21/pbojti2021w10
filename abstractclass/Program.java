/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author WINDOWS 10
 */
public class Program {

    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumba = new Ikan();
        
        Orang cimoy = new Orang("Cimoy");
        Orang istaka = new Orang("Istaka");
        
        cimoy.peliharaanHewan(kucingKampung);
        istaka.peliharaanHewan(lumba);
        
        cimoy.ajakPeliharaanJalan();
        istaka.ajakPeliharaanJalan();
    }  
}
