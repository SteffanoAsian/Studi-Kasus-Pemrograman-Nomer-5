/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.restaurant;

import java.util.Scanner;

/**
 *
 * @author MADCOMS
 */
public class MenuRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Pembayaran, Pilihan;
        String [] Menu = {"Soto Betawi", "Soto Lamongan", "Rawon", "Sate Jeroan", "Sate Telur Puyuh"};
        int [] Harga = {10000, 13000, 11000, 9000, 1500, 2000};
        
        System.out.println("Selamat Datang di Rumah Makan Tanpa Nama");
        System.out.println("Daftar Menu");
        for (int i = 0; i < Menu. length; i++){
            System.out.println(i+"."+Menu[i]+" => "+Harga[i]);
        }
        System.out.println("<<******************>>");
        System.out.println("Masukan Menu yang akan dipilih : ");
        Scanner input = new Scanner(System.in);
        Pilihan = input.nextInt();
        System.out.println("Pilihan : "+Menu[Pilihan]);
        System.out.println("Silahkan Masukan Uang anda");
        Pembayaran = input.nextInt();
        if (Pembayaran > Harga[Pilihan]){
            System.out.println("Silakan ambil uang kembalian anda :"+(Pembayaran - Harga[Pilihan]));            
        }else if (Pembayaran == Harga[Pilihan]){
            System.out.println("Terimakasih sudah membayar dengan uang pas");            
        }else{
            System.out.println("Mohon maaf, anda memiliki kekurangan pembayaran sebesar "+(Harga[Pilihan] - Pembayaran));
    }   
}
}
