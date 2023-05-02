
package com.nurgul.repository;

import com.nurgul.entity.Kullanici;
import com.nurgul.utility.MyFactoryRepository;


public class KullaniciRepository extends MyFactoryRepository{
    
    public KullaniciRepository() {
        super(new Kullanici());
    }
    
}
