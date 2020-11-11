package abstractclass;

public class MainAbstract {
    public static void main(String[] args) {
        Kucing kucingkampung = new Kucing();
        Ikan lumbalumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingkampung);
        budi.peliharaHewan(lumbalumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
