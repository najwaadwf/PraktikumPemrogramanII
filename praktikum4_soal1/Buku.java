package praktikum4_soal1;
public class Buku {
    public String judul;
    public String penulis;
    public int tahun;
    
    public Buku(String j, String p, int t) {
        judul = j;
        penulis = p;
        tahun = t;
    }
    
    public void display() {
        System.out.println("Detail Buku: ");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}