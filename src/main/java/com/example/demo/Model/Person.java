package com.example.demo.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Table(name = "PERSON_TBL")
@EntityScan(basePackages = "com.example.demo")
@Entity
@Access(value= AccessType.FIELD)
public class Person {

    @Id
    @GeneratedValue
    @Column (name="id", nullable=false)
    private Integer id;
    private String name;
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
