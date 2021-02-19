/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipsistemi;

import java.util.ArrayList;

public class Takip {

    ArrayList<Personel> personeller = new ArrayList();
    ArrayList<Personel>istenCikanlar= new ArrayList();
    

     void PersonelEkle(Personel p) {
        personeller.add(p);
         }
          
    void PersonelCikar(Personel p) {
        if(personeller.contains(p)){
             personeller.remove(p);
       istenCikanlar.add(p);
        }
        
        else{
               System.out.println(" Böyle bir personel bulunmamaktadır ");
        }
      
        
    }
    void CikanPersoneller(){
        for(Personel personel: istenCikanlar){
            System.out.println(personel.KimlikBilgileri());
        }
    }
    void PersonelListele(){
         for(Personel personel: personeller){
             System.out.println(personel.KimlikBilgileri());
         }
    }
      boolean PersonelKontrol(String Adi,String Soyadi){
         boolean personelVarMı=false;
          for(Personel personel: personeller){
            if(Adi.equals(personel.getAdi())&& Soyadi.equals(personel.getSoyadi())){
               personelVarMı= true;
                System.out.println("Bu kişi bu iş yerinde çalışıyor mu ? " + personelVarMı);
                break;
            }
            else{
                personelVarMı=false;
                System.out.println("Bu kişi bu iş yerinde çalışıyor mu ? " + personelVarMı);
                break;
            }
          }
         return personelVarMı;   
        }
        void getUnvanAdet() {
        int IsciAdet = 0, yoneticiAdet = 0, muhendisAdet=0;
        for (Personel unvan : personeller) {
            if (unvan instanceof Isci) {
                IsciAdet++;
            } else if (unvan instanceof Yonetici) {
                yoneticiAdet++;
                
            }
            else if(unvan instanceof Muhendis){
                muhendisAdet++;
                
            }
        } 
        System.out.println("İşçi Adet = " + IsciAdet);
        System.out.println("Yönetici Adet = " + yoneticiAdet);
        System.out.println("Mühendis Adet = "+muhendisAdet);
    }
    
      

  

}
