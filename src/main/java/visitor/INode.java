package visitor;

import java.util.LinkedList;

public interface INode<T> {
    INode getParent();
    T setParent(INode parent);
    LinkedList<INode> getChildren();
    T setChildren(Node...children);
}
