package com.company;

public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Ольга")
                .setSurname("Иванова")
                .setAge(35)
                .setCity("Москва")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Ивашка")
                .build();
        System.out.println("У " + mom + "есть сын, " + son);
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {

            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
