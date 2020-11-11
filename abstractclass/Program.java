package abstractclass;

public class Program {
    public static void main(String[] args) {

        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");;

        ani.peliharaanHewwan(kucingKampung);
        budi.peliharaanHewwan(lumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
