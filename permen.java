public class permen {
    public void tambahPermen() {
        int jumlahPermen = 0;
        jumlahPermen = jumlahPermen + 1;
        System.out.println("jumlah permen setelah di tambah: "+ jumlahPermen);
    }
    public static void main(String[] args) {
        permen permenSusu = new permen();
        permenSusu.tambahPermen();
    }
}
