public class Main {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan LumbaLumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(LumbaLumba);
        

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}