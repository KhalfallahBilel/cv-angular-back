package com.bilelkhalfallah.cv;

import com.bilelkhalfallah.cv.model.Language;
import com.bilelkhalfallah.cv.repository.ILanguageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;


@SpringBootApplication
public class CvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);
	}
	/*@Bean
	CommandLineRunner init(ILanguageRepository iLanguageRepository) {
		return args -> {
			Stream.of("bdfbdf", "5", 5).forEach(name -> {
				Language language = new Language(1,"mkb","5");
				iLanguageRepository.save(language);
			});
			iLanguageRepository.findAll().forEach(System.out::println);
		};
	}*/
}
