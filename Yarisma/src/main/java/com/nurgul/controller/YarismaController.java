
package com.nurgul.controller;

import com.nurgul.entity.Yarisma;
import com.nurgul.service.YarismaService;
import java.util.Scanner;


public class YarismaController {
    
    private YarismaService yarismaService;
    
    public YarismaController(){
      this.yarismaService=new YarismaService();
    }
    public void save(){
        Scanner scanner=new Scanner(System.in);
        String yadi=scanner.nextLine();
        String odul=scanner.nextLine();
        int kisiSayisi=scanner.nextInt();
        
        int yas =scanner.nextInt();
        Yarisma yarismaOlustur= new Yarisma();
        yarismaOlustur.setyAdi(yadi);
        yarismaOlustur.setOdul(odul);
        yarismaOlustur.setKatilimSayisi(kisiSayisi);
        yarismaService.save(yarismaOlustur);
       
    }
}
