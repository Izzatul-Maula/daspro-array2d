import java.util.Scanner;
public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris atau kolom tidak tersedia! Silakan coba lagi.");
                    continue;
                }
                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Peringatan: Kursi pada baris " + baris + " dan kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "!");
                    System.out.println("Silakan pilih kursi yang lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Kursi berhasil dipilih.");
                    break;
                }

                case 2:
                System.out.println("\n--- Daftar Penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {

                        String namaPenonton = penonton[i][j] != null ? penonton[i][j] : "***";
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + namaPenonton);
                    }
                }
                break;

                case 3:
                System.out.println("Keluar dari program.");
                break;

                default:
                System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
