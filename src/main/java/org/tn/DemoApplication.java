package org.tn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tn.dao.ContactRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		// contactRepository.save(new Contact("ghanem", "salem", dateFormat
		// .parse("12/05/2007"), "dfgd", 516556161L, "sdfgd"));
		// contactRepository.save(new Contact("azlouk", "ali", dateFormat
		// .parse("12/05/2001"), "dfgd", 516556161L, "sdfgd"));
		// contactRepository.save(new Contact("khazraoui", "mimi", dateFormat
		// .parse("12/05/2018"), "dfgd", 516556161L, "sdfgd"));
		//
		// contactRepository.findAll().forEach(c -> {
		//
		// System.out.println(c.getNom());
		// });
	}
}
