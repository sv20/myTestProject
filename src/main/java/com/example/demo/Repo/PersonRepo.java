package com.example.demo.Repo;

import com.example.demo.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface PersonRepo extends JpaRepository <Person,Integer> {

    Person findByName(String name);

}
