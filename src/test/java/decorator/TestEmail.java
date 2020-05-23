package decorator;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmail {

    public IEmail makeEmail(String content) {
        IEmail email = new Email(content);
        // TODO: cover 'email' with decorators {ImportantMarkerDecorator, SpamMarkerDecorator}
        return email;
    }

    @Test
    public void checkOne() {
        IEmail eml = makeEmail("Advertisement: Shop from our mall, blah blah blah !");
        assertTrue(eml.getContent().startsWith("Spam: 1"));
    }

    @Test
    public void checkTwo() {
        IEmail eml = makeEmail("Hey Hassan, This is Barack Obama !");
        assertTrue(eml.getContent().startsWith("Important: 1"));
    }

    @Test
    public void checkThree() {
        IEmail eml = makeEmail("Hey Hassan, This is Barack Obama advertising !");
        assertTrue(eml.getContent().contains("Important: 1"));
        assertTrue(eml.getContent().contains("Spam: 1"));
    }
}
