package ru.netology.orm.task2.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.orm.task2.model.Person;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery("SELECT p FROM Person p where lower(p.city) = lower(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
