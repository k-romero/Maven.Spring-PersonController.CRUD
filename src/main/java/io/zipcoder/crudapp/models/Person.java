package io.zipcoder.crudapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;

    public Person() {
    }

    public Person(String first_name, String last_name) {
        this(null,first_name, last_name);
    }

    public Person(Long id, String first_name, String last_name) {
        this.id = id;
        this.first_name = last_name;
        this.last_name = last_name;
    }


    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
