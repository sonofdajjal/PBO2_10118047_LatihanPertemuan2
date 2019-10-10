/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10118047_warnakepribadian_lt29;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama     : Abdullah Margani
 * Nim      : 10118047
 * Kelas    : if-2
 */
public class PBO2_10118047_WarnaKepribadian_lt29 {

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

 public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
 public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
 public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
 public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
 public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
 public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
 public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
 public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
     System.out.println( RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU " 
         + CYAN + "DARI " + MAGENTA + "WARNA " + BLUE + "FAFORITMU" + NORMAL);
     System.out.println(ANSI_RED_BACKGROUND + WHITE +    "      MERAH      " + NORMAL);
     System.out.println(ANSI_GREEN_BACKGROUND + WHITE +  "      HIJAU      " + NORMAL);
     System.out.println(ANSI_YELLOW_BACKGROUND + WHITE + "      KUNING     " + NORMAL);
     System.out.println(ANSI_BLUE_BACKGROUND + WHITE +   "      BIRU       " + NORMAL);
     System.out.println(ANSI_PURPLE_BACKGROUND + WHITE + "      UNGU       " + NORMAL);
     
     System.out.print("PILIH WARNA FAFORITMU : ");
     Scanner input = new Scanner(System.in);
        String fav = input.nextLine();
     System.out.print("NAMA KAMU : ");
        String nama = input.nextLine();
     System.out.println("");
     System.out.println("---HASIL TEST KEPRIBADIAN " + nama + "---");  
     System.out.println("");
     if (fav.equalsIgnoreCase("merah")){
             System.out.println(" Warna Favoritmu Adalah "+ RED + fav);
             System.out.println("1. Periang\t");
             System.out.println("2. Pemberani\t");
             System.out.println("3. Berani mengambil risiko dalam setiap langkah\t");
             System.out.println("4. Menyukai tantangan\t");
             System.out.println("5. Kurang sabar\t");
             System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kenarahannya akan sulit dikontrol\t");
             System.out.println("7. Memiliki energi kehangatan dan cinta\t");
        } 
     else if (fav.equalsIgnoreCase("hijau")){ 
             System.out.println(" Warna Favoritmu Adalah "+ GREEN + fav);
             System.out.println("1. Romantis\t");
             System.out.println("2. Menyukai hal yang berbau alami\t");
             System.out.println("3. Teguh pada prinsip\t");
             System.out.println("4. Menginginkan kesempurnaan\t");
             System.out.println("5. Mudah cemburu\t");
             System.out.println("6. Mudah merasa iri\t");
             System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan\t");
             System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai\t");
        }
     else if (fav.equalsIgnoreCase("kuning")){ 
             System.out.println(" Warna Favoritmu Adalah "+ YELLOW + fav);
             System.out.println("1. Optimis\t");
             System.out.println("2. Suka Bergaul\t");
             System.out.println("3. Periang\t");
             System.out.println("4. Senang Menolong\t");
             System.out.println("5. Lincah dan aktif\t");
             System.out.println("6. Tidak suka meremehkan kekurangan orang lain\t");
             System.out.println("7. Loyal\t");
             System.out.println("8. Hangat\t");
             System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil\t");
             System.out.println("10. Cenderung penakut\t");
        }
     else if (fav.equalsIgnoreCase("biru")){ 
             System.out.println(" Warna Favoritmu Adalah "+ BLUE + fav);
             System.out.println("1. Menyenangkan\t");
             System.out.println("2. Bijaksana\t");
             System.out.println("3. Pembawaan diri tenang saat menghadapi masalah\t");
             System.out.println("4. Dinamis\t");
             System.out.println("5. Senang Berbagi\t");
             System.out.println("6. Bersahabat\t");
             System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang\t");
             System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai\t");
        }
     else if (fav.equalsIgnoreCase("ungu")){ 
             System.out.println(" Warna Favoritmu Adalah "+ MAGENTA + fav);
             System.out.println("1. Optimis\t");
             System.out.println("2. Tidak pernah ragu\t");
             System.out.println("3. Menurutnya pasangan yang ideal adalah yang kuat\t");
             System.out.println("4. Memiliki ambisi yang benar\t");
             System.out.println("5. Memiliki empati yang besar\t");
             System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya\t");
             System.out.println("7. Terkadang bersikap keras kepala dan angkuh\t");
        } else {
        System.out.println(fav + " Belum teridentifikasi "); 
        
        
     }
    }
    
}
