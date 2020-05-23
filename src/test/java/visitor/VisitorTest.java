package visitor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Consumer;

public class VisitorTest {

    Tree tree;

    @Before
    public void init() {
        Node root = new Department("CE");
        root.setChildren(
            new ProfessorNode("Mirian").setChildren(
                    new StudentNode("Taheri"),
                    new StudentNode("Saleheh"),
                    new StudentNode("Mahdieh")
            ),
            new ProfessorNode("Movaghar").setChildren(
                    new StudentNode("Dowlati"),
                    new StudentNode("Arshad")
            ),
            new ProfessorNode("Heydarnoori").setChildren(
                    new StudentNode("Balalayi"),
                    new StudentNode("Amintabar")
            )
        );
        tree = new Tree();
        tree.setRoot(root);
    }

    @Test
    public void testBFSVisitor() {
        final StringBuilder sb = new StringBuilder();
        // TODO: We want a visitor (x) that adds node.toString() when visiting
        // node -> sb.append(node.toString());

        // TODO: We want
        tree.visitBFS(/** TODO: put visitor (x) here **/);
        assertEquals("Department{name='CE'}Professor{name='Dr. Mirian'}Professor{name='Dr. Movaghar'}Professor{name='Dr. Heydarnoori'}Student{name='Taheri'}Student{name='Saleheh'}Student{name='Mahdieh'}Student{name='Dowlati'}Student{name='Arshad'}Student{name='Balalayi'}Student{name='Amintabar'}", sb.toString());
    }

    @Test
    public void testBFSVisitorTwo() {
        final StringBuilder sb = new StringBuilder();

        // TODO: We want a visitor (y) that adds node.toString() when visiting in case it's a professor
        //    if (node instanceof ProfessorNode)
        //            sb.append(node);

        tree.visitBFS(/** TODO: put visitor (y) here **/);
        assertEquals("Professor{name='Dr. Mirian'}Professor{name='Dr. Movaghar'}Professor{name='Dr. Heydarnoori'}", sb.toString());
    }
}
