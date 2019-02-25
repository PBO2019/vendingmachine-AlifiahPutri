/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MesinKopi kopi = new MesinKopi();
        kopi.setJenisKopi("Robusta");
        kopi.setJumlahStokKopi(20);
        
        kopi.setJenisKopi("Arabica");
        kopi.setJumlahStokKopi(20);
        
        kopi.setJenisKopi("Kopi Flores");
        kopi.setJumlahStokKopi(20);
        
        MesinKopi top = new MesinKopi();
        Topping topping = new Topping();
        topping.setJenisTopping("Susu");
        topping.setJumlahStokTopping(20);
        top.setTopping(topping.getJenisTopping());
        
        topping.setJenisTopping("Gula");
        topping.setJumlahStokTopping(20);
        top.setTopping(topping.getJenisTopping());
        
        topping.setJenisTopping("Cream");
        topping.setJumlahStokTopping(20);
        top.setTopping(topping.getJenisTopping());

        kopi.getJenisKopi();
        top.getTopping();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan pilihan kopi anda : ");
        String k = s.next();
        System.out.print("Masukan pilihan topping anda : ");
        String t = s.next();
        
        System.out.println("Pesanan anda adalah kopi " + k + " dengan topping " + t);
    }
    
}
