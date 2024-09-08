public class methoddengannilaibalik {
    public static void main(String[] args) {
        int sisi = 4;
        System.out.println("luas persegi dengan panjang sisi " + sisi + " adalah " + hitungLuasPersegi(sisi));
    }
     
    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        
        return luas;
    }
}
