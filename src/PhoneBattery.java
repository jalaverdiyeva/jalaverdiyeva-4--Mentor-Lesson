

public class PhoneBattery {
    public static void main(String[] args) {

        int enerjiSeviyyesi = 100;//başlanğıc enerji səviyyəsi

        //while dövrü - enerji>0 olduğu müddətcə
        while(enerjiSeviyyesi>0){
            //cari enerji səviyyəsini çap edirik
            System.out.println("Cari enerji səviyyəsi: " + enerjiSeviyyesi + "%");
            enerjiSeviyyesi -= 10;//enerji səviyyəsini 10 vahid azaldırıq
        }

        //enerji bitdikdə mesaj
        System.out.println("Telefon söndü. Zəhmət olmasa enerji yığın.");
    }
}
