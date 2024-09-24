public class contohMethod {
    public static int hitungLuasPersegi (int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        int sisi = 5;
        int luas = hitungLuasPersegi(sisi);
        System.out.println("Luas persegi dnegan sisi " + sisi + " adalah " + luas);
    }
}
