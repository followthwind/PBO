import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nama anda: ");
        String nama = reader.readLine();

        System.out.print("Masukkan usia anda: ");
        int usia = Integer.parseInt(reader.readLine());

        System.out.println(nama + "\n " + usia + "tahun");
    }
}
