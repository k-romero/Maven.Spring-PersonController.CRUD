package io.zipcoder.crudapp.services;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repo;

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
        originalPerson.setFirstName(newPersonData.getFirstName());
        originalPerson.setLastName(newPersonData.getLastName());
        return repo.save(originalPerson);
    }

    public Boolean delete(Long id) {
        repo.delete(id);
        return true;
    }


}
