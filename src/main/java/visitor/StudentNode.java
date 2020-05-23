package visitor;

public class StudentNode extends Node {

    String name;

    public StudentNode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }

}
