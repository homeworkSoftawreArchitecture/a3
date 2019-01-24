package model;

import java.util.ArrayList;

public class Teacher implements User {
    String name;
    String id;
    int age;
    String department;

    private Teacher(String name, String id, int age, String department) {
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

    public String getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    p
}
