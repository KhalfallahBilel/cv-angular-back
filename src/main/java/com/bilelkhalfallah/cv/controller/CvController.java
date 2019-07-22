package com.bilelkhalfallah.cv.controller;

import com.bilelkhalfallah.cv.model.Cv;
import com.bilelkhalfallah.cv.repository.ICvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CvController {

    public CvController() {
    }

    @Autowired
    ICvRepository iCvRepository;

    @GetMapping("/cvList")
    public List<Cv> getCvList(){
        return (List<Cv>) iCvRepository.findAll();
    }

    @PostMapping("/cvList")
    public Cv save(Cv cv){
        return iCvRepository.save(cv);
    }
}
