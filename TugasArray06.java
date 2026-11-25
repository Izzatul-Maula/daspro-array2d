import java.util.Scanner;
public class TugasArray06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlResponden = 10;
        int jmlPertanyaan = 6;

        int[][] survei = new int[jmlResponden][jmlPertanyaan];

        System.out.println("=== Input Hasil Survei ===");
        for (int i = 0; i < jmlResponden; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                System.out.print("Responden ke-" + (i + 1) + ", Pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Rata-rata Setiap Responden ===");
        for (int i = 0; i < jmlResponden; i++) {
            int totalResponden = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                totalResponden += survei[i][j];
            }
            double rataResponden = (double) totalResponden / jmlPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResponden);
        }
        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < jmlPertanyaan; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < jmlResponden; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = (double) totalPertanyaan / jmlResponden;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < jmlResponden; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = (double) totalKeseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);

    }
}
    
