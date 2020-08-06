package com.example.demo.Controller;

import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @PostMapping("/addPeople")
    public List<Person> addPeople(@RequestBody List<Person> people){
        return personService.savePeople(people);
    }

    @GetMapping("/people")
    public List<Person> findAllPeople() {
        return personService.getPeople();
    }

    @GetMapping("person/{id}")
    public Person findPersonById(@PathVariable  int id){
        return personService.getPersonById(id);

    }

//    pubic Person findPersonByName(@PathVariable String name){
//        return personService.getPersonByName(name);
//    }

    @PutMapping("updatePerson")
    public Person updatePerson(@RequestBody Person person){
        return null;
    }

    @DeleteMapping("person/{id}")
    public String deletePerson(@PathVariable Integer id){
        return personService.deletePerson(id);
    }

}
