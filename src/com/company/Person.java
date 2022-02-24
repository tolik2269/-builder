package com.company;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    public static final String DEFAULT_CITY = "unknown";
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;


    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
        this.city = city;
    }


    public boolean hasAge() {
        if (age > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasCity() {
        return city != null;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void happyBrithday() {
        if (hasAge() == true) {
            age++;
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name
                + "surname=" + surname
                + "age=" + age
                + "city=" + city + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    public PersonBuilder newChildBuilder() {
        final int DEFAULT_AGE = 0;
        PersonBuilder newChildBuilder = new PersonBuilder();
//  newChildBuilder.build();
        newChildBuilder.setSurname(surname);
        newChildBuilder.setAge(DEFAULT_AGE);
        return newChildBuilder;

    }

}

