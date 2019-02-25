/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;


/**
 *
 * @author ACER
 */
public class Topping {
    
    private String JenisTopping;
    private int JumlahStokTopping;
    
    public void setJenisTopping(String JenisTopping){
        this.JenisTopping=JenisTopping;
    }
    public void setJumlahStokTopping(int JumlahStokTopping){
        this.JumlahStokTopping=JumlahStokTopping;
    }
    public String getJenisTopping(){
        return JenisTopping;
    }
    public int getJumlahStokTopping(){
        return JumlahStokTopping;
    }
}
