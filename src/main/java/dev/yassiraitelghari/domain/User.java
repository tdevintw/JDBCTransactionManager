package dev.yassiraitelghari.domain;

public class User {
    private int id ;
    private String name;
    private int age;
    private float salary;
    private Departement departement;

    public User(String name, int age, Departement departement , float salary) {
        this.name = name;
        this.age = age;
        this.departement = departement;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
