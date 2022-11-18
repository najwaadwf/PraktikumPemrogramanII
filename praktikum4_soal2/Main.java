package praktikum4_soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan: ");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan Pilihan : ");
        int opsi = input.nextInt();
        input.nextLine();

        if (opsi == 1){
            String judul, penulis, tahun, genre, sinopsis;
            System.out.print("Judul: ");
            judul = input.nextLine();

            System.out.print("Penulis : ");
            penulis = input.nextLine();

            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();

            System.out.print("Genre : ");
            genre = input.nextLine();

            System.out.print("Sinopsis: ");
            sinopsis = input.nextLine();

            Novel nov = new Novel(judul, penulis, tahun, genre, sinopsis);
            System.out.println(nov.getNovelDetail());
        }
        else if (opsi == 2){
            String judul, penulis, tahun, sinopsis;
            int volume;
            System.out.print("Judul: ");
            judul = input.nextLine();

            System.out.print("Penulis: ");
            penulis = input.nextLine();

            System.out.print("Tahun Terbit: ");
            tahun = input.nextLine();

            System.out.print("Volume: ");
            volume = input.nextInt();

            input.nextLine();
            System.out.print("Sinopsis: ");
            sinopsis = input.nextLine();

            Komik kom = new Komik(judul, penulis, tahun, volume, sinopsis);
            System.out.println(kom.getKomikDetail());
        } else{
            System.out.println("Tidak ada di daftar pilihan");
        }
    }
}