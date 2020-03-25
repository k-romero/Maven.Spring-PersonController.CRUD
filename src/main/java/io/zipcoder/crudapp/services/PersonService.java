package io.zipcoder.crudapp.services;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository repo;

    @Autowired
    public PersonService(PersonRepository repo){
        this.repo = repo;
    }

    public Iterable<Person> index(){
        return repo.findAll();
    }

    public Person show(Long id){
        return repo.findOne(id);
    }

    public Person create(Person person){
        return repo.save(person);
    }

    public Person update(Long id, Person newPersonData){
        Person originalPerson = repo.findOne(id);
        originalPerson.setFirst_name(newPersonData.getFirst_name());
        originalPerson.setLast_name(newPersonData.getLast_name());
        return repo.save(originalPerson);
    }

    public Boolean delete(Long id) {
        repo.delete(id);
        return true;
    }


}
