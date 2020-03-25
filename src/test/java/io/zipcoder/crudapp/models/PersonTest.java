package io.zipcoder.crudapp.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import javax.persistence.Entity;

import static org.junit.Assert.*;


public class PersonTest {

    @Test
    public void testClassSignatureAnnotations(){
        assertTrue(Person.class.isAnnotationPresent(Entity.class));
    }

}
