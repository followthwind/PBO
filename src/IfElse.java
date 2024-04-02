import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai anda(0-100): ");
        int nilai = scanner.nextInt();

        if (nilai > 100) {
            System.out.println("invalid");
        }
        if (nilai >= 80 && nilai < 100) {
            System.out.println("Nilai Anda A!");
        } else if (nilai >= 70 && nilai < 100) {
            System.out.println("Nilai Anda B!");
        } else if (nilai >= 60 && nilai < 100) {
            System.out.println("Nilai Anda C!");
        } else if (nilai < 60){
            System.out.println("Nilai Anda D!");
        }
    }
}
