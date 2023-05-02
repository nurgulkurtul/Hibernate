
package com.nurgul.service;


import com.nurgul.entity.Yarisma;
import com.nurgul.repository.YarismaRepository;
import com.nurgul.utility.MyFactoryService;


public class YarismaService extends MyFactoryService<YarismaRepository, Yarisma, Long> {
    
    public YarismaService() {
        super(new YarismaRepository());
    }
    
}
