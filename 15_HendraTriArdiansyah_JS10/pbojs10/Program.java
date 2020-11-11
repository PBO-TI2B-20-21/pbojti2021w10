package pbojs10;
public class Program {
    public static void main(String[] args) {
        Kucing kucingAnggora = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang hendra = new Orang("Hendra");
        
        ani.peliharanHewan(kucingAnggora);
        hendra.peliharanHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        hendra.ajakPeliharaanJalanJalan();
    }
}
