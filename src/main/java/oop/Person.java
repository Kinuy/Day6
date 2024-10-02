package oop;

public class Person {
    private String name;
    private int age;
    private String gender;



    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        System.out.printf("Hello, I am %s a %s and %d years old.",name,gender,age);
    }
}
