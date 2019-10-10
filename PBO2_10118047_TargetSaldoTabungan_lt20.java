/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_targetsaldotabungan_lt20;

/**
 *
 * @author user
 * Nama     : Abdullah Margani
 * Nim      : 10118047
 * Kelas    : if-2
 */
public class PBO2_10118047_TargetSaldoTabungan_lt20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i,total,bunga;
        total=3500000;
        bunga= (int) (total*0.08);
        total = total+bunga;
        i=1;
        do{
            System.out.println("Saldo dibulan ke- " +i + " Rp. " +total);
            i++;
            bunga =(int)(total * 0.08);
            total+=bunga;
        }
        while(i<=8);
        
        
    }
    
}
