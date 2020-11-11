/**
 * program
 */
public class Program {
    public static void main(String[] args) {
        Kucing KucingKampung = new Kucing();
        Ikan lumbalumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(KucingKampung);
        budi.peliharaHewan(lumbalumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}