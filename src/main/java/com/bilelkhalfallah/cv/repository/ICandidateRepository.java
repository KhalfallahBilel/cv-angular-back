package com.bilelkhalfallah.cv.repository;

import com.bilelkhalfallah.cv.model.Candidate;
import org.springframework.data.repository.CrudRepository;

public interface ICandidateRepository extends CrudRepository<Candidate, Long> {
}
