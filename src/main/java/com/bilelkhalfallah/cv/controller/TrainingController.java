package com.bilelkhalfallah.cv.controller;

import com.bilelkhalfallah.cv.helper.ResourceNotFoundException;
import com.bilelkhalfallah.cv.model.Training;
import com.bilelkhalfallah.cv.repository.ITrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TrainingController {

    public TrainingController() {
    }

    @Autowired
    ITrainingRepository iTrainingRepository;

    @GetMapping("/trainings")
    public List<Training> getTrainings(){
        return (List<Training>) iTrainingRepository.findAll();
    }

    @PostMapping("/trainings")
    public Training save(Training training){
        return iTrainingRepository.save(training);
    }

    @GetMapping("trainings/{id}")
    public ResponseEntity<Training> getById(@PathVariable(value = "id") Long trainingId){
        Training training = iTrainingRepository.findById(trainingId)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Training not found ::" +trainingId)
                );
        return ResponseEntity.ok().body(training);
    }
}
