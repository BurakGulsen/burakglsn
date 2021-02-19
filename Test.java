/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipsistemi;

public class Test {

    public static void main(String[] args) {
    Takip t = new Takip();
    Muhendis m1 = new Muhendis("Ali", "Öztürk", 27,2015);
    Muhendis m2 = new Muhendis("Mahmut", "Kartal", 32,2012);
    Muhendis m3 = new Muhendis("Ahmet", "Tekin", 30,2011);
    Isci i1 = new Isci("Zafer", "Şener", 35,2010);
    Isci i2 = new Isci("Musa", "Tekin", 25,2015);
    Yonetici y1 = new Yonetici("Bora", "Aydoğdu", 45,2008);
    t.PersonelEkle(m1);
    t.PersonelEkle(m2);
    t.PersonelEkle(m3);
    t.PersonelEkle(i1);
    t.PersonelEkle(i2);
    t.PersonelEkle(y1);
    t.getUnvanAdet();
    t.PersonelListele();
    System.out.println("-------------------------");
    t.PersonelCikar(i1);
    t.PersonelListele();
    t.PersonelListele();
    t.PersonelCikar(i1);
    System.out.println("-------------------------");
    t.CikanPersoneller();
    t.PersonelKontrol("Ali","Öztürk");
    t.PersonelKontrol("Bora","Aydoğdu");
    System.out.println("-------------------------");
    i1.GunlukCalisma(9.30, 16.30);
    System.out.println("-------------------------");
    i1.GunlukCalisma(6.30, 12.30);
    i1.HaftalikCalisma(7, 3);
    i1.PersonelSurecGoster(y1, 2020);
    System.out.println( i1.KimlikBilgileri());
    t.getUnvanAdet();
    y1.GunlukCalisma(10, 17);
    y1.HaftalikCalisma(5, 5);
    m1.GunlukCalisma(10, 15);
    t.CikanPersoneller();
    t.PersonelCikar(y1);
    t.PersonelListele();
    t.getUnvanAdet();
    y1.GunlukCalisma(12, 20);
    
   
    
    
    }
}
