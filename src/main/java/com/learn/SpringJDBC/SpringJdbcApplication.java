package com.learn.SpringJDBC;

import com.learn.SpringJDBC.model.Alien;
import com.learn.SpringJDBC.repository.AlienRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Rashmi");
		alien1.setTech("Java");

		AlienRepository alienRepository = context.getBean(AlienRepository.class);
		alienRepository.save(alien1);

		System.out.println(alienRepository.findAll());
	}


}
