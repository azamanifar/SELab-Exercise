package visitor;

public class ProfessorNode extends Node {

    String name;

    public ProfessorNode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Professor{name='Dr. " + name + "'}";
    }

}
