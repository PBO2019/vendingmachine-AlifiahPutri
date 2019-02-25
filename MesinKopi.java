/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;



/**
 *
 * @author ACER
 */
public class MesinKopi {
    ArrayList<String> kopi = new ArrayList<>();
    ArrayList<String> topping = new ArrayList<>();
    private String JenisKopi;
    private String Topping;
    private int JumlahStokKopi;
    
    public void setJenisKopi(String JenisKopi){
        kopi.add(JenisKopi);
    }
    public void getJenisKopi(){
       for(int i = 0; i<kopi.size();i++){
            int j = i+1;
            System.out.println("Menu kopi " + j + " " + kopi.get(i));
        }
    }
    public void setJumlahStokKopi(int JumlahStokKopi){
        this.JumlahStokKopi=JumlahStokKopi;
    }
    public int getJumlahStokKopi(){
        return JumlahStokKopi;
    }
    public void setTopping(String JenisTopping){
        topping.add(JenisTopping);
    }
    public void getTopping(){
        for(int i = 0; i<topping.size();i++){
            int j = i+1;
            System.out.println("Topping " + j + " " + topping.get(i));
        }
    }
}
