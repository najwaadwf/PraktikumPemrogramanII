package praktikum4_soal2;
public class Komik extends Buku {
        private int volume;
        private String sinopsis;
    
    public Komik(String judul, String penulis, String tahun, int volume, String sinopsis) {
        super.judul = judul;
        super.penulis = penulis;
        super.tahun = Integer.valueOf(tahun);
        this.sinopsis = sinopsis;
        this.volume = volume;
    }
    public String getKomikDetail(){
        return "Data yang baru di inputkan adalah\nSebuah Komik dengan judul \"" + judul
                + "\". Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun
                + ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah."
                + "\nSinopsis : " + sinopsis.substring(0,64) + "...";  
    }
}