public class permenglobal {
    int jumlahPermen = 10;
    // buat nampilin jumlah
    public void getJumlahpermen() {
        System.out.println("jumlah permen" + jumlahPermen);
    }
    public void tambahPermen() {
        jumlahPermen = jumlahPermen + 1;
        System.out.println("jumlah permen setelah di tambah:" + jumlahPermen);
    }
    public static void main(String[] args) {
        permenglobal permenSusu = new permenglobal();
        
        //menampilkan jumlah permen yang ada saat program pertama x berjalan
        permenSusu.getJumlahpermen();
        
        //menambah satu permen
        permenSusu.tambahPermen();
        
        //menampilkan jumlah permen yang ada
        permenSusu.getJumlahpermen();
    }
}
