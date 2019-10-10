/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02_10118047_perhitunganlingkaran_lt22;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama     : Abdullah Margani
 * Nim      : 10118047
 * Kleas    : if-2 
 */
public class PB02_10118047_PerhitunganLingkaran_lt22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("========= Perhitungan lingkaran =========");
        System.out.print("Masukan nilai diameter : " );
        int diameter = input.nextInt();
        
        System.out.println("========= Hasil Perhitungan Lingkaran =======");
        System.out.println("Jari -Jari lingkaran \t: " +(diameter/2));
        System.out.println("Luas lingkaran \t\t: " + (3.14*(diameter/2)*(diameter/2)));
        System.out.println("Keliling lingkaran \t: " +(2*3.14*(diameter/2)));
    }
    
}
