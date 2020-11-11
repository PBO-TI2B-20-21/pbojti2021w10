/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10.abstractclass;

/**
 *
 * @author DEBORA
 */
public class program {
    public static void main(String[] args){
        kucing kucingKampung= new kucing();
        ikan lumbaLumba = new ikan();
        
        orang ani = new orang("Ani");
        orang budi = new orang("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}

