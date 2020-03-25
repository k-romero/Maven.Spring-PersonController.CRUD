package io.zipcoder.crudapp.controllers;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service){
        this.service = service;
    }

    @GetMapping("/people/")
    public ResponseEntity<Iterable<Person>> getPersonList(){
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/people/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id){
        return null;
    }

    @PostMapping("/people/")
    public Person createPerson(@RequestBody Person p){
        return new Person();
    }

    @PutMapping("/people/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person person){
        return new ResponseEntity<>(service.update(id,person),HttpStatus.OK);
    }

    @DeleteMapping("/people/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}

