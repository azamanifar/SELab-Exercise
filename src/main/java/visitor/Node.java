package visitor;

import java.util.Arrays;
import java.util.LinkedList;

public class Node implements INode<Node> {

    INode parent;
    LinkedList<INode> children;

    public Node() {
    }

    @Override
    public Node setParent(INode parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public Node setChildren(Node... children) {
        this.children = new LinkedList<>(Arrays.asList(children));
        return this;
    }

    @Override
    public INode getParent() {
        return parent;
    }

    @Override
    public LinkedList<INode> getChildren() {
        return children;
    }

}
