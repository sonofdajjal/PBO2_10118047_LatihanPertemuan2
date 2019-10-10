/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_hurufbesarkecil_lt27;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama     : Abdullah Margani
 * Nim      : 10118047
 * Kelas    : if-2
 */

public class PBO2_10118047_HurufBesarKecil_lt27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String huruf = scanner.next();

        String besar = huruf.toUpperCase();
        String kecil = huruf.toLowerCase();

        System.out.println();
        System.out.println("====== Hasil Formating ======");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf kecil : " + kecil);
        
        
    }
    
}
