package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public Student(Long id) {
        super(id);
    }

    public Student(Long id, String name) {
        super(id, name);
    }
}
