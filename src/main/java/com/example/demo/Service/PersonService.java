package com.example.demo.Service;

import com.example.demo.Repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Person;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person savePerson(Person person){
        return personRepo.save(person);
    }

    public List<Person> savePeople(List<Person> people){
        return personRepo.saveAll(people);
    }

    public List<Person> getPeople(){
        return personRepo.findAll();
    }

    public Person getPersonById(int id){
        return personRepo.findById(id).orElse(null);
    }

    public Person getPersonByName(String name){
        return personRepo.findByName(name);
    }

    public String deletePerson(Integer id){
        personRepo.deleteById(id);
        return "person removed"+id;
    }

//    public Person updatePerson(Person person){
//
//        Person existingPerson = personRepo.findById(person.getId()).orElse(null);
//        existingPerson.setName(person.getName());
//        existingPerson.setAge(person.getAge());
//        existingPerson.setAddress(person.getAddress());
//        return personRepo.save(existingPerson);
//    }
}
