package model;

public class Administrator {
    String name;
    String id;

    private Administrator(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public boolean editBookInfo() {

    }

    public void generateBorrowingReport() {

    }

    public void generatePnaltyReport() {

    }

    public void getInfo() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
