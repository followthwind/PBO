import java.util.Scanner;

public class ScannerNama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia anda: ");
        int usia = scanner.nextInt();

        System.out.println(nama + "\n" + usia + " tahun");
    }
}
