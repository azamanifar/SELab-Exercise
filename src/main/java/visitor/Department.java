package visitor;

public class Department extends Node {

    String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "'}";
    }

}
