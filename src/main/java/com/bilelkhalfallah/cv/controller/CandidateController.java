package com.bilelkhalfallah.cv.controller;


import com.bilelkhalfallah.cv.helper.ResourceNotFoundException;
import com.bilelkhalfallah.cv.model.Candidate;
import com.bilelkhalfallah.cv.repository.ICandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CandidateController {

    @Autowired
    ICandidateRepository iCandidateRepository;

    public CandidateController() {
    }

    @PostMapping("/candidates")
    public Candidate save(Candidate candidate){
        return iCandidateRepository.save(candidate);
    }

    @GetMapping("/candidates/{id}")
    public ResponseEntity<Candidate> getById(@PathVariable(value = "id") Long candidateId){
        Candidate candidate = iCandidateRepository
                .findById(candidateId).orElseThrow(
                        () -> new ResourceNotFoundException("Candidate not found ::" +candidateId)
                );
        return ResponseEntity.ok().body(candidate);
    }

    @GetMapping("/candidates")
    public Iterable<Candidate> getAll(){
        return iCandidateRepository.findAll();
    }
}
