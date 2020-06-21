import java.util.Scanner;
//Untuk menghitung 
public class switchcase4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //inisiasi variabel
        int harga, jumlah, total = 0;
        int potongan1, potongan2, potongan3;
        //menghitung harga barang
        System.out.print ("Masukkan Harga Barang : Rp ");
        harga = input.nextInt();
        System.out.print ("Jumlah Barang : ");
        jumlah = input.nextInt();
        total = harga*jumlah;
        System.out.println("Total Bayar : Rp "+ total);
        
        
        potongan1 = (total -((total*5)/100));
        potongan2 = (total - ((total*10)/100));
        potongan3 = (total - ((total*15)/100));

    }
}
