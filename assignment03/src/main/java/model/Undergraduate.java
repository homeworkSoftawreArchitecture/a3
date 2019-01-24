package model;

import java.util.ArrayList;

public class Undergraduate implements User {
    String name;
    String id;
    int age;
    String department;

    private Undergraduate(String name, String id, int age, String department) {
        this.age = age;
        this.department = department;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean borrowBooks(ArrayList<Book> books) {
        return false;
    }

    @Override
    public boolean editInfo() {
        return false;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
