/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_programrataratanilai_lt21;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama     : Abdullah Margani
 * Nim      : 10118047
 * Kelas    : if-2
 */
public class PBO2_10118047_ProgramRataRataNilai_lt21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n,jml,nilai[];
        float rata,jumlah=0;
        
        //input jumlah mahasiwa        
        System.out.print("Masukan Banyaknya mahasiswa : ");
        n=input.nextInt();
        
        //inisialisasi array        
        nilai = new int[n];
        
        //Input nilai
        for (int i=0;i<= n-1; i++){
            System.out.print("Nilai mahasiswa ke- " +(i+1)+":");
            nilai[i]=input.nextInt();
        }
        //Hitung jumlah
        for (int j=0;j<= n-1; j++){
            jumlah=jumlah +nilai[j];
        }
        //Hitung rata2
        rata=jumlah/n;
        
        //output
        System.out.println("");
        System.out.println("Maka Rata-rata Nilainya adalah " +rata);
    }
    
}
