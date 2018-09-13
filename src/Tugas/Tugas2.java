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
public class Tugas2 {
    private static void tampiljudul (){
        System.out.println("Hitung upah supir");
        System.out.println("\nA = 4kg/5000; \nB = 5kg/7000; \nC = 2kg/2000; \nD = 3kg/3000; \nE = 7kg/10000");
    }
 
    public static void main(String[] args) {
    tampiljudul();
    
    Scanner input = new Scanner(System.in);
    System.out.println("Target Maximal Upah = ");
    int uang = input.nextInt();
    String nama [] = {"E","B","A","D","C"};
    int berat [] = {7,5,4,3,2};
    int harga [] = {10000,7000,5000,3000,2000};
    int jumlah;
    
    for (int i = 0; i < harga.length; i++){
        if (uang >= harga [i]){
             jumlah = uang/harga[i];
                uang = uang%harga[i];
                System.out.println(" Barang " + nama[i] + " sebanyak " + jumlah + " buah ");
    }
    }
    }
}
