package com.bilelkhalfallah.cv.controller;

import com.bilelkhalfallah.cv.helper.ResourceNotFoundException;
import com.bilelkhalfallah.cv.model.Experience;
import com.bilelkhalfallah.cv.repository.IExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {

    public ExperienceController() {
    }

    @Autowired
    IExperienceRepository iExperienceRepository;

    @GetMapping("/experiences")
    public List<Experience> getExperiences(){
        return (List<Experience>) iExperienceRepository.findAll();
    }

    @GetMapping("/experiences/{id}")
    public ResponseEntity<Experience> getById(@PathVariable(value = "id") Long experienceId){
        Experience experience = iExperienceRepository.findById(experienceId)
                .orElseThrow(() -> new ResourceNotFoundException("Experience not found ::" +experienceId));
        return ResponseEntity.ok().body(experience);
    }

    @PostMapping(".experiences")
    public Experience save(Experience experience){
        return iExperienceRepository.save(experience);
    }
}
