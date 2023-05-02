
package com.nurgul.service;

import com.nurgul.entity.Kullanici;
import com.nurgul.repository.KullaniciRepository;
import com.nurgul.utility.MyFactoryRepository;
import com.nurgul.utility.MyFactoryService;


public class KullaniciService extends MyFactoryService<KullaniciRepository, Kullanici, Long> {
    
    public KullaniciService() {
        super(new KullaniciRepository());
    }
    
}
