import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai N: ");
        int N = input.nextInt();

        tampilkanAngkaGanjil (N);

    }

    public static void tampilkanAngkaGanjil (int N) {
        System.out.println("Tampilkan angka ganjil dari 0 hingga" + N + ": ");
        for (int i = 1; i <= N; i += 2) {
        System.out.println(i + " ");
    }
    System.out.println();
    
    }
}
