package decorator;

public class Email implements IEmail {

    String content;

    public Email(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

}
