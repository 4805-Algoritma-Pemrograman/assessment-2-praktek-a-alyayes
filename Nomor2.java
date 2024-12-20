import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    static int[] hargaMenu = {35000, 45000, 20000, 15000};
    static ArrayList<Integer> keranjangBelanja = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "Burger":
                    keranjangBelanja.add(harga[0]);
                    break;
                case "Steak":
                    keranjangBelanja.add(harga[1]);
                    break;
                case "Spaghetti":
                    keranjangBelanja.add(harga[2]);
                    break;
                case "Kentang":
                    keranjangBelanja.add(harga[3]);
                    break;
                default:
                    System.out.println("Menu Tidak Ada");
            }

            System.out.print("Input lagi (Y/N)?: ");
            pilihan = scanner.nextLine().toUpperCase();
        } while (!pilihan.equals("N"));

        int totalBelanja = hitungTotalBelanja();
        int diskon = hitungDiskon(totalBelanja);
        int totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan = " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);
    }

    static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

    static int hitungDiskon(int totalBelanja) {
        if (totalBelanja < 50000) {
            return 0;
        } else if (totalBelanja >= 50000 && totalBelanja <= 100000) {
            return (int) (totalBelanja * 0.05);
        } else {
            return (int) (totalBelanja * 0.1);
        }
    }
}
