package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

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

}
