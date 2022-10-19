package prak203_2110817220014_najwadwifebrianti;
//class Employee tidak dapat berfungsi pada file Soal3Main karena pada file tersebut class yang digunakan adalah class Pegawai,
    //solusinya ganti class Employee dengan Pegawai 
    //public class Employee {
    public class Pegawai {
        public String nama;
        
        //Penggunaan tipe data char tidak tepat, karena pada umumnya tempat asal pastilah sekurang-kurangnya 1 kata
        //public char asal;
        public String asal;
        
        public String jabatan;
        public int umur;
        //karna kita menambahkan instansiasi baru di file main, kita juga perlu  menambahkan metode get pada file class
        public int getUmur(){
        return umur;
        }
        public String getNama() {
        return nama;
        }
        public String getAsal() {
        return asal;
        }
        
        /*eror karena variabel j belum diberi parameter sehingga tidak dapat diidentifikasi,
        maka perlu di tambahkan dalam parameter setJabatan(String j)*/
        /*public void setJabatan() {
        this.jabatan = j;*/
        public void setJabatan(String j) {
        this.jabatan = j;
        }
    }
