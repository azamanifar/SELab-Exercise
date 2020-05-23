package decorator;

public class SpamMarkerDecorator implements IEmail {

    /** TODO:
     *          implement this class in way that puts
     *          "Spam: 1\n"
     *          in the beginning of the content if the 'message'.toLowerCase() contains
     *          "advertis"
     */

    public SpamMarkerDecorator() {
    }

    @Override
    public String getContent() {
        //TODO: fix this
        return "";
    }
}
