import java.util.Scanner;

public class waktu_ujian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input User (waktu mulai)
        System.out.println("Silahkan melakukan input -->");
        System.out.print("Jam mulai: ");
        int jamMulai = scanner.nextInt();
        System.out.print("Menit mulai: ");
        int menitMulai = scanner.nextInt();
        System.out.print("Detik mulai: ");
        int detikMulai = scanner.nextInt();

        // Input User (waktu selesai)
        System.out.print("Jam selesai: ");
        int jamSelesai = scanner.nextInt();
        System.out.print("Menit selesai: ");
        int menitSelesai = scanner.nextInt();
        System.out.print("Detik selesai: ");
        int detikSelesai = scanner.nextInt();

        // Menghitung total detik untuk waktu mulai dan akhir
        int totalDetikMulai = jamMulai * 3600 + menitMulai * 60 + detikMulai;
        int totalDetikSelesai = jamSelesai * 3600 + menitSelesai * 60 + detikSelesai;

        // Mengubah durasi dalam detik
        int durasiDetik = totalDetikSelesai - totalDetikMulai;

        // Validasi waktu
        if (durasiDetik < 0) {
            System.out.println("Waktu akhir tidak boleh lebih awal dari waktu mulai oyyy!!!");
            return;
        }

        // Menghitung jam, menit, dan detik dari durasi
        int durasiJam = durasiDetik / 3600;
        durasiDetik %= 3600;
        int durasiMenit = durasiDetik / 60;
        durasiDetik %= 60;

        // Output hasil
        System.out.println("Durasi ujian: " + durasiJam + " jam, " + durasiMenit + " menit, " + durasiDetik + " detik.");

        scanner.close();
    }
}
//tugas milik Kinantan