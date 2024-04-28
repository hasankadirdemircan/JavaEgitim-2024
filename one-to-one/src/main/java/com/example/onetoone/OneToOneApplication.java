package com.example.onetoone;

import com.example.onetoone.model.Address;
import com.example.onetoone.model.Person;
import com.example.onetoone.repository.PersonRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		oneToOneSelect();
	}

	public void oneToOneSave() {
		Person person = new Person();
		Address address = new Address();
		address.setCity("ankara");
		address.setStreet("etimesg");

		person.setName("hasan");
		person.setAddress(address);
		Person savedPerson = personRepository.save(person);
		System.out.println(savedPerson);
	}

	public void oneToOneDelete() {
		personRepository.deleteById(2L);
	}

	public void oneToOneSelect() {
		Optional<Person> person = personRepository.findById(4L);
		person.ifPresent(System.out::println);
	}
}
