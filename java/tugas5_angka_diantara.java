import java.util.Scanner;

public class tugas5_angka_diantara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int angka_pertama, angka_terakhir, i;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                               Selamat Datang di CEK ANGKA DIANTARA \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Angka pertama : ");
        angka_pertama = scan.nextInt();
        System.out.println("Angka terakhir : ");
        angka_terakhir = scan.nextInt();

        //Operator
        System.out.println("Angka yang berada di antara " + angka_pertama + " dan " + angka_terakhir + " adalah");
        for (i = angka_pertama; i <= angka_terakhir; i++) {
            System.out.print(i + " ");
        }
    }
}
//Tugas Milik Kinantan