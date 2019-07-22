package com.bilelkhalfallah.cv.controller;

import com.bilelkhalfallah.cv.helper.ResourceNotFoundException;
import com.bilelkhalfallah.cv.model.Skill;
import com.bilelkhalfallah.cv.model.Training;
import com.bilelkhalfallah.cv.repository.ISkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {

    public SkillController() {
    }

    @Autowired
    ISkillRepository iSkillRepository;

    @GetMapping("/skills")
    public List<Skill> getTrainings(){
        return (List<Skill>) iSkillRepository.findAll();
    }

    @PostMapping("/skills")
    public Skill save(Skill skill){
        return iSkillRepository.save(skill);
    }

    @GetMapping("skills/{id}")
    public ResponseEntity<Skill> getById(@PathVariable(value = "id") Long skillId){
        Skill skill = iSkillRepository.findById(skillId)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Skill not found ::" +skillId)
                );
        return ResponseEntity.ok().body(skill);
    }
}
