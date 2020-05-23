package visitor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class Tree {

    INode root;

    public Tree() {
    }

    public void setRoot(INode root) {
        this.root = root;
    }

    public void visitBFS(
            // TODO: We need to get a 'visitor here
    ) {
        Queue<INode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            INode current = queue.poll();
            // TODO: Now make 'visitor' visit 'current'.
            LinkedList<INode> children = current.getChildren();
            if (children != null)
                for (int i = 0; i < children.size(); i++)
                    queue.add(children.get(i));
        }

    }

}
