package ru.dp29.springMVCSecond.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotBlank(message = "Should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 & 30 char")
    private String name;

    @Min(value = 0, message = "Возраст не может быть отрицательным")
    private int age;

    @NotBlank(message = "should not be empty")
    @Email(message = "Email must be valid!")
    private String email;

    public Person() {}

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
