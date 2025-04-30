package com.API.controller;

import com.API.entity.NewEntity;
import com.API.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




//http://localhost:8080/api/v1/home


@RestController
@RequestMapping("/api/v1/home")
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
//Delete mapping code
    @DeleteMapping
    public ResponseEntity<String>  deleteRegistration(
            @RequestParam Long id
    ){
        newService.deleteById(id);
        return new ResponseEntity<>("Data deleted successfully", HttpStatus.OK);
    }




}
