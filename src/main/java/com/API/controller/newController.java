package com.API.controller;

import com.API.entity.NewEntity;
import com.API.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class newController {
@Autowired
    private NewService newService;
@PostMapping
    public ResponseEntity<NewEntity> save(
            @RequestBody NewEntity newEntity) {

        {

            newService.saveData(newEntity);
            return new ResponseEntity<>(newEntity, HttpStatus.CREATED);
        }
    }
}
