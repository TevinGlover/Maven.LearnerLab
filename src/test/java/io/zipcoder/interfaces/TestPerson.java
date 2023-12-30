package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestPerson {
    @Test
    public void personTest(){
        Long id = 3l;
        Person person = new Person(id);
        Assert.assertNotNull(person);
    }

    @Test
    public void person1Test(){
        Person person = new Person( 2l, "Roger");
        Assert.assertNotNull(person);
    }
    @Test
    public void personNameTest(){
        Person person = new Person( 1l, "Roger");

        person.setName("john");

        String actual = person.getName();
        String expected = "john";

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void idTestGet(){
        Person person = new Person(19l);
      Long actual = person.getId();
        Long expected = 19l;
        Assert.assertEquals(expected,actual);
    }
    // 1.0- 1.1 test done


}
