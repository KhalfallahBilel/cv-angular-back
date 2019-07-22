package com.bilelkhalfallah.cv.controller;

import com.bilelkhalfallah.cv.helper.ResourceNotFoundException;
import com.bilelkhalfallah.cv.model.Language;
import com.bilelkhalfallah.cv.repository.ILanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LanguageController {

    public LanguageController() {
    }

    @Autowired
    ILanguageRepository iLanguageRepository;

    @GetMapping("/languages")
    public List<Language> getLanguages(){
        return (List<Language>) iLanguageRepository.findAll();
    }

    @PostMapping("/languages")
    public Language save(Language language){
        return iLanguageRepository.save(language);
    }

    @GetMapping("languages/{id}")
    public ResponseEntity<Language> getById(@PathVariable(value = "id") Long languageId){
        Language language = iLanguageRepository.findById(languageId)
        .orElseThrow(
                () -> new ResourceNotFoundException("Language not found ::" +languageId)
        );
        return ResponseEntity.ok().body(language);
    }
}
