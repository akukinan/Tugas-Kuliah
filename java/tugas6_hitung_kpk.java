import java.util.Scanner;

public class tugas6_hitung_kpk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int bilangan1, bilangan2, kpk;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                   Selamat Datang di HITUNG KPK \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Masukkan bilangan ke-1 : ");
        bilangan1 = scan.nextInt();
        System.out.println("Masukkan bilangan ke-2 : ");
        bilangan2 = scan.nextInt();

        //Operator
        kpk = Math.max(bilangan1, bilangan2);
        while ( kpk % bilangan1 != 0 || kpk % bilangan2 != 0){
            kpk += Math.max(bilangan1, bilangan2);
        }

        //Output
        System.out.println("KPK dari " + bilangan1 + " dan " + bilangan2 + " adalah --> " + kpk);
    }
}
//Tugas Milik Kinantan