import java.util.Scanner;
public class Faktorial06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat non-negatif: ");
        int n = sc.nextInt();
        int faktorial = 1;
        if (n < 0) {
            System.out.println("Faktorial tidak bisa untuk bilangan negatif.");
            return;
        }

        for (int i = 1;i <= n; i++){
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
    }
}
