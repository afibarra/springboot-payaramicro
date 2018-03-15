package me.afibarra.coding.learning.springbootpayaramicro.controllers;

import me.afibarra.coding.learning.springbootpayaramicro.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class DummyController {

    Map<Integer, Person> persons = new HashMap<>();

    @PostConstruct
    public void init() {
        persons.put(1, new Person(1, "Mert", "Caliskan", "m**@gmail.com"));
        persons.put(2, new Person(2, "Steve", "Millidge", "s**@c2b2.co.uk"));
        persons.put(3, new Person(3, "Andrew", "Pielage", "a**@c2b2.co.uk"));
    }

    @GetMapping("/all")
    public Collection<Person> getAll() {
        return persons.values();
    }
}
