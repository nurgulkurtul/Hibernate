
package com.nurgul.controller;

import com.nurgul.entity.Kullanici;
import com.nurgul.service.KullaniciService;
import java.util.Scanner;


public class KullaniciController {
    
    private KullaniciService kullaniciService;
    
    public KullaniciController (){
        this.kullaniciService=new KullaniciService();
    }
   
    public void save(){
        Scanner scanner=new Scanner(System.in);
        String kullaniciAdi=scanner.nextLine();
        String kullaniciSoyadi=scanner.nextLine();
        int yas =scanner.nextInt();
        Kullanici kullanici= new Kullanici();
        kullanici.setAd(kullaniciAdi);
        kullanici.setSoyad(kullaniciSoyadi);
        kullanici.setYas(yas);
        kullanici.getKatildigiYarismalar();
        kullanici.getOlusturduguYarismalar();
        kullaniciService.save(kullanici);
        
    }
}
