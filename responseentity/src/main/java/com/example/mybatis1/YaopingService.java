package com.example.mybatis1;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface YaopingService {
    List<yaoping> findAllDrugs();

    yaoping findDrugsById(int drug_id);

    @Transactional
    void addDrugs(yaoping Drugs);

    @Transactional
    void updateDrugs(yaoping drug);

    @Transactional
    public void deleteDrugs(int drug_id);
}
