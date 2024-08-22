package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User(null,"Bakus","12345", Instant.now());
		User user2 = new User(null,"Berthe","12345", Instant.now());
		userService.save(user);
		userService.save(user2);

		List<User>users = userService.findAll();
		System.out.println(users);

		Optional<User>optionalUser = userService.findOne(3L);
		System.out.println(optionalUser);

		user2.setSpeudo("Bakus007");
		userService.save(user2);

		userService.delecte(user.getId());

	}
}
