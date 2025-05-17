package com.mycompany.belajarjava;

/**
 * Demonstrasi Operator Boolean dalam Java
 * @author luqmanaru
 */
public class BelajarJava {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean hasil;
        
        // Operasi AND
        hasil = a && b;
        System.out.println("Hasil dari a && b : " + hasil);
        
        // Operasi OR
        hasil = a || b;
        System.out.println("Hasil dari a || b : " + hasil);
        
        // Operasi NOT
        hasil = !b;
        System.out.println("Hasil dari !b : " + hasil);
    }
}
