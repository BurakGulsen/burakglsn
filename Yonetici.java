/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipsistemi;


public class Yonetici extends Personel {
    private int yillikIzin=60;
    private double maas=20000;
    private int gunlukCalismaSaati=8;
    private double CalisilanGunSayisi=5;

   public Yonetici() {
    }
   
    public Yonetici(String Adi, String Soyadi, int yas, int girisYili) {
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
        }else{
        
        System.out.println("Yöneticinin giriş saati = "+ girisSaati);
        System.out.println("Yöneticinin çıkış saati = "+ cikisSaati);
        System.out.println("Yöneticinin normal şartlar altındaki günlük çalışma saati = "+ gunlukCalismaSaati);
        System.out.println("Yöneticin şu anki günlük çalışma saati = "+ (cikisSaati-girisSaati));
        if(gunlukCalismaSaati>=cikisSaati-girisSaati){
            System.out.println("Yönetici günlük çalışma saatini tamamladı.");
        }
        else{
            System.out.println("Yönetici günlük çalışma saatini tamamlamadı. Yönetim tarafından yıllık izninden bir gün kesilmesine karar verildi...");
            
            System.out.println("Normal şartlar altında bir yöneticinin yıllık izni : "+ yillikIzin);
            yillikIzin--;
             System.out.println("Kalan yıllık izni = "+ yillikIzin);
        }
    }}

    @Override
    void HaftalikCalisma(double ortGunlukCalismaSaati ,double fazladanCalistigiSaat) {
        if(ortGunlukCalismaSaati*CalisilanGunSayisi>40){
            System.out.println("Yönetici gerekli çalışma saatini doldurdu ve normal çalışma süresinin üstüne çıktı, yönetim tarafından mesai ücreti eklenecek...");
            maas = maas+fazladanCalistigiSaat*10/100;
            System.out.println("Mesaiyle birlikte mühendisin bu ay ki maaşı = "+ maas); 
        }
        else if (ortGunlukCalismaSaati*CalisilanGunSayisi==40){
            System.out.println("Yöneticci gerekli çalışma saatini doldurdu");
        }
        else if(ortGunlukCalismaSaati*CalisilanGunSayisi<40){
            System.out.println("Yönetici gerekli çalışma saatinin altında kaldı, yönetim tarafından %10'luk bir maaş kesintisi uygulanacak...");
            maas=maas-maas*10/100;
            System.out.println("Yönetici bu ay ki maaşı = "+ maas);
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
