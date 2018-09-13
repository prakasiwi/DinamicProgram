/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class Tugas1 {
    public static void main(String[] args) {
        int pecahan [] = new int []{5000,2000,1000,500};
        int jumlah;
        
        System.out.println(" Masukkan nilai uang anda = ");
        Scanner input = new Scanner(System.in);
        int uang = input.nextInt();
        
        for (int i = 0; i < pecahan.length; i++ ){
            if(uang >= pecahan[i]){
                jumlah = uang/pecahan[i];
                uang = uang%pecahan[i];
                System.out.println(" Pecahan " + pecahan[i] + " sebanyak " + jumlah + " buah ");
            }
            
        }
        
    }
 
}
