import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input pilihan
        System.out.print("Masukkan pilihan pasangan capres anda (1/2/3): ");
        int pilihan = scanner.nextInt();

        // Percabangan Switch-case
        switch (pilihan) {
            case 1:
                System.out.println("Anies - Amin");
                break;
            case 2:
                System.out.println("Prabowo - Gibran");
                break;
            case 3:
                System.out.println("Ganjar - Mahfud");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
