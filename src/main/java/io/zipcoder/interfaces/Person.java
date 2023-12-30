package io.zipcoder.interfaces;

public class Person {

    private final Long id;
    private String name;


    public Person(Long id) {
        this.id = id;
    }

    public Person(Long id, String name){
        this.id = id;
        this.name = name;

    }

    public void setName(String name) {this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return id;
    }
}
