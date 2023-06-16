package net.flix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.flix.repo.UserDetailsRepo;

@SpringBootApplication
@EntityScan("net.flix.model")
@EnableJpaRepositories(basePackageClasses = {UserDetailsRepo.class})
@ComponentScan("net.flix.*")
public class FileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}

}
