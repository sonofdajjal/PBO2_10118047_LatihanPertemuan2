/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_waktusaatini_lt26;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author user
 * Nama     : Abdullah Margani
 * Nim      : 10118047
 * Kelas    : if-2
 */
public class PBO2_10118047_WaktuSaatIni_lt26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateTime = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss");
        String showDateTime = dateTime.format(cal.getTime());
        System.out.println("Hari ini adalah hari : " + showDateTime);
        System.out.println("");
        
        
    }
    
}
