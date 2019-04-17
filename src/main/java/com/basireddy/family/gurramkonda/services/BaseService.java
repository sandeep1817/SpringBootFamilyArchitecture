package com.basireddy.family.gurramkonda.services;

import com.basireddy.family.gurramkonda.entities.IndiraFamily;
import com.basireddy.family.gurramkonda.repositories.IndiraFamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService{

    @Autowired
    private IndiraFamilyRepository indiraFamilyRepository;

    public BaseService(IndiraFamilyRepository IndiraFamilyRepository) {
        this.indiraFamilyRepository = IndiraFamilyRepository;
    }

    public List<IndiraFamily> findAll(){
        return indiraFamilyRepository.findAll();
    }

}
