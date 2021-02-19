/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipsistemi;

/**
 *
 * @author BurakGulsen
 */
public class Isci extends Personel {
    private int yillikIzin = 20;
    private double maas=5000;
    private int gunlukCalismaSaati=8;
      private double CalisilanGunSayisi=6;

    public Isci() {
    }
   
    public Isci(String Adi, String Soyadi, int yas,int girisYili) {
        super(Adi, Soyadi, yas,girisYili);
    }

 
     @Override
    void PersonelSurecGoster(Personel p, int yil) {
        super.PersonelSurecGoster(p, yil); 
    }
    
     @Override
      void GunlukCalisma(double girisSaati, double cikisSaati) {
        if(girisSaati<6 || cikisSaati>20){
            System.out.println("İşyerimiz saat sabah 7 ile akşam 20 arasında çalışmaktadır...");
        }
        else{ 
        System.out.println("İşçinin giriş saati = "+ girisSaati);
        System.out.println("İşçinin çıkış saati = "+ cikisSaati);
        System.out.println("İşçinin normal şartlar altındaki günlük çalışma saati = "+ gunlukCalismaSaati);
        System.out.println("İşçinin şu anki günlük çalışma saati = "+(cikisSaati-girisSaati));
        
        if(gunlukCalismaSaati<=cikisSaati-girisSaati){
            System.out.println("İşçi günlük çalışma saatini tamamladı.");
        }
        else{
            System.out.println("İşçi günlük çalışma saatini tamamlamadı. "
                    + "Yönetim tarafından yıllık izninden bir gün kesilmesine karar verildi...");
            System.out.println("Normal şartlar altında bir işçinin yıllık izni : "+ yillikIzin);
            yillikIzin--;
             System.out.println("Kalan yıllık izni = "+ yillikIzin);
        }
    }
    }

    @Override
    void HaftalikCalisma(double ortGunlukCalismaSaati,double fazladanCalistigiSaat) {
        if(ortGunlukCalismaSaati*CalisilanGunSayisi>40){
            System.out.println("İşçi gerekli haftalık çalışma saatini doldurdu ve normal çalışma süresinin üstüne çıktı, yönetim tarafından mesai ücreti eklenecek...");
            maas = maas+fazladanCalistigiSaat*100;
            System.out.println("Mesaiyle birlikte işçinin bu ay ki maaşı = "+ maas); 
        }
        else if (ortGunlukCalismaSaati*CalisilanGunSayisi==40){
            System.out.println("İşçi gerekli çalışma saatini doldurdu");
        }
        else if(ortGunlukCalismaSaati*CalisilanGunSayisi<40){
            System.out.println("İşçi gerekli çalışma saatinin altında kaldı, yönetim tarafından %10'luk bir maaş kesintisi uygulanacak...");
            System.out.println("İşçinin normal şartlar altındaki maaşı = "+ maas);
            maas=maas-maas*10/100;
            System.out.println("İşçinin bu ay ki maaşı = "+ maas);
        }
    }
     public int getYillikIzin() {
        return yillikIzin;
    }

    public void setYillikIzin(int yillikIzin) {
        this.yillikIzin = yillikIzin;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getGunlukCalismaSaati() {
        return gunlukCalismaSaati;
    }

    public void setGunlukCalismaSaati(int gunlukCalismaSaati) {
        this.gunlukCalismaSaati = gunlukCalismaSaati;
    }

    public double getCalisilanGunSayisi() {
        return CalisilanGunSayisi;
    }

    public void setCalisilanGunSayisi(double CalisilanGunSayisi) {
        this.CalisilanGunSayisi = CalisilanGunSayisi;
    }
  

   
    
      public String KimlikBilgileri() {
        return "Personel{" + "Adi = "+ super.getAdi()+ ", Soyadi = " + super.getSoyadi() + ", yas = " + super.getYas() + ", Çalştığı kurum = " + super.getKurum()+ ", Giriş Yılı = "+ super.getGirisYili()+"}";
           
}
}
