/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_cakep_lt30;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama     : Abdllah Margani
 * Nim      : 10118047
 * Kelas    : if-2
 */
public class PBO2_10118047_Cakep_lt30 {

    /**
     * @param args the command line arguments
     */
 public static final String NORMAL = "\u001b[0m";
 public static final String BLACK = "\u001b[30m";
 public static final String RED = "\u001b[31m";
 public static final String GREEN = "\u001b[32m";
 public static final String YELLOW = "\u001b[33m";
 public static final String BLUE = "\u001b[34m";
 public static final String MAGENTA = "\u001b[35m";
 public static final String CYAN = "\u001b[36m";
 public static final String WHITE = "\u001b[37m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println(RED + "Kamu "+ GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 sampe " + MAGENTA + "latihan 30 ini? ");
        System.out.print(MAGENTA + "Jawab" + "(Yoi/Enggak) : ");
        
        Scanner input = new Scanner(System.in);
        String ya = input.nextLine();
        
        if (ya.equalsIgnoreCase("Yoi")){System.out.println(RED + "Cakep bener " + MAGENTA + "Good Job ");
        } else{ 
            System.out.println("");
            System.out.println(RED + "Tetep cakep sih.");
            System.out.println(CYAN + "yang penting paham konsepnya yee.");
        }
        
    }
    
}
