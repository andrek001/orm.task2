package ru.netology.orm.task2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.netology.orm.task2.model.Person;
import ru.netology.orm.task2.repository.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository repository;

	public PersonService(PersonRepository repository) {
		this.repository = repository;
	}

	public List<Person> getPersonsByCity(String city) {
		return repository.getPersonsByCity(city);
	}
}
