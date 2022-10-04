/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak105_2110817220014_najwadwifebrianti;

/**
 *
 * @author asus
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class PRAK105_2110817220014_NajwaDwiFebrianti {
    public static void main(String[] args) {
        double jari, tinggi, hasil;
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        jari = input.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextDouble();
        
        hasil = 3.14 * jari * jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}
