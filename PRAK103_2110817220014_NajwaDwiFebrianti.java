/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak103_2110817220014_najwadwifebrianti;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class PRAK103_2110817220014_NajwaDwiFebrianti {
    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input bilangan : ");
        bil = input.nextInt();
        
        int i = 5;
        
        do {            
            if (bil % 7 != 0){
                if (i == 5){
                   System.out.print(bil);
                } else {
                    System.out.print(", " + bil);
                }
            }
            
            bil--;
            i--;
        } while (i > 0);
    }
}
