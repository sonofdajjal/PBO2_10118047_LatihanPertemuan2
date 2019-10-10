/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_programtunjangan_lt17;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama     : Abdulah Margani
 * Nim      : 10118047
 * Kelas    : if-2
 */
public class PBO2_10118047_ProgramTunjangan_lt17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double tunjangan = 0.0;
        
        Scanner UserInput = new Scanner(System.in);
        
        System.out.println("========== Program Tunjangan ==========");
        System.out.print("Berapa Gaji Anda Perbulan \t: Rp. ");
        Double Gapok = UserInput.nextDouble();
        System.out.println("Status anda?(menikah/belum)\t:");
        String Status = UserInput.next();
        
        
        System.out.println("========Hasil perhitungan Gaji=========");
       
        System.out.println("Gaji Pokok \t= " +Gapok);
        
         
         if(Status.equalsIgnoreCase("menikah")){
            tunjangan = (Double) (0.35*Gapok);                        
        }
         
         else{
            tunjangan = 0.0;             
        }
         System.out.println("Tunjangan \t= "+tunjangan);
         System.out.println("Total Gaji \t= "+(Gapok + tunjangan));
    }
    
}
