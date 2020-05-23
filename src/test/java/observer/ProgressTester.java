package observer;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ProgressTester {

    @Test
    public void test() {
        IObserver observer1 = new LoadAnotherProcessInMiddle();
        IObserver observer2 = new ProgressReporter();
        IObserver observer3 = new RunAnotherProcessInEnd();
        Progress progress = new Progress();
        // TODO: add observers {observer1, observer2, observer3} to 'progress'
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream realOut = System.out;
        System.setOut(new PrintStream(buffer));
            for (int i = 0; i < 100; i++) {
                progress.increment();
            }
        System.setOut(realOut);
        String output = buffer.toString();
        assertTrue(output.contains("Reporting progress: 10%"));
        assertTrue(output.contains("Reporting progress: 70%"));
        assertTrue(output.contains("Halfway through task completion, let's load another process on memory."));
        assertTrue(output.contains("Running next process.."));
    }

}
