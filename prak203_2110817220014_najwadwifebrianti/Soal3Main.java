package prak203_2110817220014_najwadwifebrianti;
public class Soal3Main {
public static void main(String[] args) {
            Pegawai p1 = new Pegawai();
            //kurang tanda ;
            //p1.nama = "Roi"
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            p1.setJabatan("Assasin");
            //pada file java tidak ada instansiasi variabel umur, sehingga kita perlu menginstansiasi nya sesuai dengan soal
            p1.umur = 17;
            System.out.println("Nama Pegawai: " + p1.getNama());
            System.out.println("Asal: " + p1.getAsal());
            System.out.println("Jabatan: " + p1.jabatan);
            //kita juga harus mengganti nilai yang dipanggil menjadi metode getUmur()
            System.out.println("Umur: " + p1.getUmur());
    }
}