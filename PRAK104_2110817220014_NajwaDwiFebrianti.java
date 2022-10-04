/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak104_2110817220014_najwadwifebrianti;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class PRAK104_2110817220014_NajwaDwiFebrianti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kartu Andi : ");
        int andi1 = input.nextInt();
        int andi2 = input.nextInt();
        int andi3 = input.nextInt();
        
        System.out.println("Kartu Budi : ");
        int budi1 = input.nextInt();
        int budi2 = input.nextInt();
        int budi3 = input.nextInt();
                
        int andi = andi1 + andi2 + andi3;
        int budi = budi1 + budi2 + budi3;
        
        if (andi > budi){
            System.out.println("Andi");
        } else if (andi == budi){
            System.out.println("Seri");
        }
        else {
            System.out.println("Budi");
        }
    }
}
