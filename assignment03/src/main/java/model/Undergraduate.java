package model;

public class Undergraduate implements User {
    String name:
    String id;
    Int age;
    boolean gender;
    String department;

    public boolean borrowBooks(Books books) {

    }

    public boolean editInfo() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public boolean isGender() {
        return gender;
    }

    public Int getAge() {
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

    public void setAge(Int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
