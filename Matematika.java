/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2praktikum;

/**
 *
 * @author HP
 */
public class Matematika implements InterfaceMatematika{
    public int pertambahan(int a, int b){
        int tambah = a + b;
        System.out.println("Hasil Pertambahan   : " + tambah);
        return tambah;
    }
    
    public int pengurangan(int a, int b){
        int kurang = a - b;
        System.out.println("Hasil Pengurangan   : " + kurang);
        return kurang;
    }
    
    public int perkalian(int a, int b){
        int kali = a * b;
        System.out.println("Hasil Perkalian     : " + kali);
        return kali;
    }
    
    public int pembagian(int a, int b){
        int bagi = a / b;
        System.out.println("Hasil Pembagian     : " + bagi);
        return bagi;
    }
}
