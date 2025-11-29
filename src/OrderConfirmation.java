import java.util.Scanner;

public class OrderConfirmation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        boolean isConfirmed=false;//təsdiqləmə üçün boolean dəyişəni

        do{ //do-while dövrü
            //sifarişin xülasəsini çap edirik
            System.out.println("sifarişinizi son dəfə nəzərdən keçirin. Ümumi məbləğ: 85 AZN");
            System.out.print("sifarişi təsdiqləyirsiniz? (yes/no): "); String cavab = scanner.nextLine();// istifadəçinin cavabını alırıq

            //cavabı yoxlayırıq (böyük/kiçik hərflərə həssas olmadan)
            if (cavab.equalsIgnoreCase("yes")) {
                isConfirmed = true;
                System.out.println("✅ Sifariş Təsdiqləndi! Göndərilmə prosesinə başlandı.");
            }else{ System.out.println(" Sifariş təsdiqlənmədi. \n Zəhmət olmasa yenidən cəhd edin.");
            }
        }while (!isConfirmed);//təsdiqləmə alınmayana qədər təkrarlayırıq

        scanner.close();
    }
}
