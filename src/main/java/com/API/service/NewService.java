package com.API.service;

import com.API.entity.NewEntity;
import com.API.repository.NewEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewService {
    @Autowired
    private NewEntityRepository newEntityRepository;

    public NewEntity saveData(NewEntity newEntity){
       NewEntity save =  newEntityRepository.save(newEntity);
       return save;
    }

}
