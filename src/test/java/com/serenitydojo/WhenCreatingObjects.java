package com.serenitydojo;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class  WhenCreatingObjects {
    @Test
    public void shouldCreateADogObject() {
        Dog dog = new Dog("Fido", "Bone", 3);
        Assert.assertEquals("Fido", dog.getName());
        Assert.assertEquals("Bone", dog.getFavouriteToy());
        Assert.assertEquals(3, dog.getAge());
    }
}
