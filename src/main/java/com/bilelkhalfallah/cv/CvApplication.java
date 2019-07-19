package com.bilelkhalfallah.cv;

import com.bilelkhalfallah.cv.model.Candidate;
import com.bilelkhalfallah.cv.repository.ICandidateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(ICandidateRepository iCandidateRepository){
//		return args -> {
//			Stream.of("Khalfallah","Bilel","FullStack Developper","0781392385","06100 Nice","khalfallah.bilel@gmail.com","","","").forEach(name->{
//				//Candidate candidate = new Candid;
//				ICandidateRepository.save(candidate);
//			});
//			iCandidateRepository.findAll().forEach(System.out::println);
//		};
//	}
}
