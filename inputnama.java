import java.util.Scanner;

public class inputnama {
    public static void main(String[] args) {
        System.out.println("masukan nama anda");
        try (Scanner scanner = new Scanner(System.in)) {
            String nama = scanner.next();
            System.out.println("nama anda adalah: "+ nama);
        }
    }
}
