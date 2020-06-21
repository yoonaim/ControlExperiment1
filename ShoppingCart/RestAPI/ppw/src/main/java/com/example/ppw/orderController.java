import java.util.Scanner;

public class switchcase4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, total = 0;
        int potongan1, potongan2, potongan3;

        System.out.print ("Masukkan Harga Barang : Rp ");
        harga = input.nextInt();
        System.out.print ("Jumlah Barang : ");
        jumlah = input.nextInt();
        total = harga*jumlah;
        System.out.println("Total Bayar : Rp "+ total);
    }
}
