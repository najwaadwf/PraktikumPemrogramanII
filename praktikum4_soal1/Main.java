package praktikum4_soal1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String j, p;
        int t;
        
        System.out.print("Judul: ");
        j = input.nextLine();
        
        System.out.print("Penulis: ");
        p = input.nextLine();

        System.out.print("Tahun Terbit: ");
        t = input.nextInt();
        
        Buku book = new Buku (j, p, t);
        book.display();
    }
}    