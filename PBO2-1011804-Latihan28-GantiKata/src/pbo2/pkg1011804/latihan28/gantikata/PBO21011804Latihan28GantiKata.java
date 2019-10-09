/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011804.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Freza
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk mengganti kata

 */
public class PBO21011804Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Scanner = new Scanner (System.in);
        System.out.println("===Program Mengganti kata===");
        System.out.print("Masukkkan Kalimat :");
        String kalimat=Scanner.nextLine();
        System.out.print("Ganti Kata :");
        String kata=Scanner.nextLine();
        System.out.print("Menjadi Kata :");
        String ganti=Scanner.nextLine();
        System.out.println("===Hasil Formatting====");
        ganti = kalimat.replaceAll(kata,ganti);
        System.out.println(" kalimat Awal "+kalimat);
        System.out.println(" kalimat Baru "+ganti);
        
        
        
        
        
        
    }
    
}
