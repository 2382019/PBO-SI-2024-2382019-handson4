public class contohReturnValue {

    //Method dengan return value bertipe int
    public static int tambah (int a, int b) {
        int hasil = a + b;
        return hasil; // mengembalikan hasil penjumlahan
    }

    //Method dengan return value bertipe boolean
    public static boolean apakahGenap(int angka) {
        return angka % 2 == 0; // mengembalikan true jika angka genap, false jika ganjil
    }

    //Method dengan return value bertipe String
    public static String sapaan(String nama) {
        return "Halo, " + nama + "!"; // mengembalikan string sapaan
    }

    public static void main(String[] args) {
        int hasilPenjumlahan = tambah(3, 5 );
        System.out.println("3 + 5 = " + hasilPenjumlahan);
    }

}
