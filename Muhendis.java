/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipsistemi;


    public class Muhendis extends Personel {
     private int yillikIzin=25;
     private double maas=10000;
     private int gunlukCalismaSaati=7;
     private double CalisilanGunSayisi=5;
    
 
     public Muhendis(String Adi, String Soyadi, int yas, int girisYili ) {
        super(Adi, Soyadi, yas,girisYili);
    }

    public Muhendis() {
    }

    @Override
    void PersonelSurecGoster(Personel p, int yil) {
        super.PersonelSurecGoster(p, yil); 
    }
  
     
    @Override
    void GunlukCalisma(double girisSaati, double cikisSaati) {
         if(girisSaati<6 || cikisSaati>20){
            System.out.println("İşyerimiz saat sabah 7 ile akşam 20 arasında çalışmaktadır...");
        }else{
        
        System.out.println("Mühendisin giriş saati = "+ girisSaati);
        System.out.println("Mühendisin çıkış saati = "+ cikisSaati);
        System.out.println("Mühendisin normal şartlar altındaki günlük çalışma saati = "+ gunlukCalismaSaati);
        System.out.println("Mühendisin şu anki günlük çalışma saati = "+(cikisSaati-girisSaati));
     
   
        if(gunlukCalismaSaati<=cikisSaati-girisSaati){
            System.out.println("Mühendis günlük çalışma saatini tamamladı.");
        }
        else{
            System.out.println("Mühendis günlük çalışma saatini tamamlamadı. Yönetim tarafından yıllık izninden bir gün kesilmesine karar verildi...");
            System.out.println("Normal şartlar altında bir mühendisin yıllık izni : "+ yillikIzin);
            yillikIzin--;
            System.out.println("Kalan yıllık izni = "+ yillikIzin);
            
        }
    } }

    @Override
    void HaftalikCalisma(double ortGunlukCalismaSaati,double fazladanCalistigiSaat) {
        if(ortGunlukCalismaSaati*CalisilanGunSayisi>35){
            System.out.println("Mühendis gerekli çalışma saatini doldurdu ve normal çalışma süresinin üstüne çıktı, yönetim tarafından mesai ücreti eklenecek...");
            maas = maas+fazladanCalistigiSaat*10/100;
            System.out.println("Mesaiyle birlikte mühendisin bu ay ki maaşı = "+ maas); 
        }
        else if (ortGunlukCalismaSaati*CalisilanGunSayisi==35){
            System.out.println("Mühendis gerekli çalışma saatini doldurdu");
        }
        else if(ortGunlukCalismaSaati*CalisilanGunSayisi<35){
            System.out.println("Mühendis gerekli çalışma saatinin altında kaldı, yönetim tarafından %10'luk bir maaş kesintisi uygulanacak...");
            maas=maas-maas*10/100;
            System.out.println("Mühendisin bu ay ki maaşı = "+ maas);
        }
    }

   
     @Override
    public String KimlikBilgileri() {
        return "Personel{" + "Adi = "+ super.getAdi()+ ", Soyadi = " + super.getSoyadi() + ", yas = " + super.getYas() + ", Çalştığı kurum = " + super.getKurum()+ ", Giriş Yılı = "+ super.getGirisYili()+"}";
           
}
    }
