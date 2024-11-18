import java.util.Scanner;

public class tugas5_hitung_mean_advance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        double total, mean, nilai_bilangan;
        int n;
        String input_user;
        total = 0;
        n = 0;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                Selamat Datang di HITUNG RATA RATA \

                        ==================================================\
                        
                        """
        );

        System.out.println("Silahkan input nilai ('x' untuk keluar)");

        while (true) {
            //Input User
            input_user = scan.nextLine();
            if (input_user.equalsIgnoreCase("x")) { //Validator Break
                break;
            }

            try {
                //Operator
                nilai_bilangan = Double.parseDouble(input_user);
                total += nilai_bilangan;
                n++;
            } catch (NumberFormatException exception) { //Validator Input User
                System.out.println("Input tidak valid!!!");
            }
        }

        //Output
        if (n > 0) {
            mean = total / n;
            System.out.println("Rata-rata dari " + n + " bilangan adalah : " + mean);
        } else {
            System.out.println("Tidak ada bilangan yang diinput!!!");
        }
    }
}
//Tugas Milik Kinantan