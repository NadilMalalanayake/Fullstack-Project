package net.java.springboot;

import net.java.springboot.model.User;
import net.java.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private userRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		this.userRepo.save(new User("Nadil","Viksura","nadil@gmail.com"));
		this.userRepo.save(new User("supun","perera","supun@gmail.com"));
		this.userRepo.save(new User("kamal","kandage","kamal@gmail.com"));
	}
}
