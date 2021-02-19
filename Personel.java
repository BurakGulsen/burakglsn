/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipsistemi;

import java.util.ArrayList;
import java.util.Date;

public class Personel {
    private  final  String kurum="FSMVU";
    private String Adi;
    private String Soyadi;
    private int yas;
    private int girisYili;
   
     
     
    public Personel(){   
    }

    public Personel(String Adi, String Soyadi, int yas, int girisYili) {
        this.Adi = Adi;
        this.Soyadi = Soyadi;
        this.yas = yas;
        this.girisYili=girisYili;
                
    }   
            
     void PersonelSurecGoster(Personel p,int yil){
         System.out.println("Personelin işe girdiği yıl = "+ p.girisYili);
         int calistigiSure=0;
         System.out.println("Personelin şirkette aktif olarak çalıştığı yıl = " +(calistigiSure=yil-p.girisYili));
        
    
} 
    void GunlukCalisma(double girisSaati,double cikisSaati){
        
    }
    void HaftalikCalisma(double ortGunlukCalismaSaati,double fazladanCalistigiSaat){ 
    }    

    public String getKurum() {
        return kurum;
    }
   
 

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

   
    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String Soyadi) {
        this.Soyadi = Soyadi;
    }

  
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }  
       public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }
    
    public String KimlikBilgileri() {
        return "Personel{" + "Adi=" + Adi + ", Soyadi=" + Soyadi + ", yas=" + yas + "Kurum = " + kurum + "Giriş Yılı = "+ girisYili+"}";
    }
}
