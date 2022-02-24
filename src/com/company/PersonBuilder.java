package com.company;

public class PersonBuilder {
    private Person newPerson;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    protected int age;
    protected String city;
    protected String name;
    protected String surname;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Не должно быть меньше нуля");
        }
        this.age = age;
        return this;

    }

    public Person build() {
        newPerson = new Person(name, surname, age, city);
        if (name == null,surname == null, city == null){
            throw new IllegalStateException("Должны быть заполненны эти данные");
        }
        return newPerson;

    }

}
