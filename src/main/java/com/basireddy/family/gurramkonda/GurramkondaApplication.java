package com.basireddy.family.gurramkonda;

import com.basireddy.family.gurramkonda.entities.IndiraFamily;
import com.basireddy.family.gurramkonda.repositories.IndiraFamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.basireddy.family.gurramkonda.repositories"})
public class GurramkondaApplication implements CommandLineRunner {
	@Autowired
	private IndiraFamilyRepository indiraFamilyRepository;

	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(GurramkondaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		IndiraFamily iff = new IndiraFamily();
		iff.setGender("MALE");
		iff.setName("Sandeep");
		iff.setId(1L);
		iff.setRelation(iff1,"Brother");
		IndiraFamily iff1 = new IndiraFamily();
		iff1.setGender("MALE");
		iff1.setName("Sandeep brother");
		iff1.setId(1L);
		iff1.setRelation(iff,"Brother");
		indiraFamilyRepository.save(iff);
	}
}
