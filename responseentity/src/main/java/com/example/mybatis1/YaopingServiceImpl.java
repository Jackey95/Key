package com.example.mybatis1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class YaopingServiceImpl implements YaopingService {
    @Autowired
    private YaopingMapper yaopingMapper;

    @Override
    public List<yaoping> findAllDrugs() {
        return yaopingMapper.findAllDrugs();
    }
    @Override
    public yaoping findDrugsById(int drug_id) {
        return yaopingMapper.findDrugById(drug_id);
    }
    @Override
    @Transactional
    public void addDrugs(yaoping Drugs) {
        yaopingMapper.addDrugs(Drugs);
    }
    @Override
    @Transactional
    public void updateDrugs(yaoping drug) {
        yaopingMapper .updateDrugs (drug) ;
    }
    @Override
    @Transactional
    public void deleteDrugs(int drug_id) {
        yaopingMapper.deleteDrugs(drug_id);
    }
}
