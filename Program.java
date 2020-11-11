package com.company;

public class Program {

    public static void main(String[] args) {
        Kucing kucingAnggoro = new Kucing();
        Ikan Cupang = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingAnggoro);
        budi.peliharaHewan(Cupang);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
