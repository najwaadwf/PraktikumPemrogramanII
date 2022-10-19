package prak203_2110817220014_najwadwifebrianti;
//class Employee tidak dapat berfungsi pada file Soal3Main karena pada file tersebut class yang digunakan adalah class Pegawai,
    //solusinya ganti class Employee dengan Pegawai 
    //public class Employee {
    public class Pegawai {
        public String nama;
        
        //Penggunaan tipe data char tidak tepat, sehingga diganti menggunakan tipe data String
        //public char asal;
        public String asal;
        
        public String jabatan;
        public int umur;
        //karna sebelumnya menambahkan instansiasi baru di file main, maka juga perlu  menambahkan metode get pada file class
        public int getUmur(){
        return umur;
        }
        public String getNama() {
        return nama;
        }
        public String getAsal() {
        return asal;
        }
        /*menambahkan parameter dalam setJabatan(String j)*/
        /*public void setJabatan() {
        this.jabatan = j;*/
        public void setJabatan(String j) {
        this.jabatan = j;
        }
    }