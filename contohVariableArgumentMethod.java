public class contohVariableArgumentMethod {
    //method yang parameternya bervariasi dan banyak
    public static int jumlahkan(int... angka){
        int total = 0;
        for (int nilai : angka) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        int hasil1 = jumlahkan(1, 2, 3);
        System.out.println("Hasil 1: " + hasil1); // output: Hasil 1: 6

        int hasil2 = jumlahkan(4, 5);
        System.out.println("Hasil 2: " + hasil2); // output: Hasil 2: 9

        int hasil3 = jumlahkan();
        System.out.println("Hasil 3: " +  hasil3); // output: Hasil 3: 0
    }
}
