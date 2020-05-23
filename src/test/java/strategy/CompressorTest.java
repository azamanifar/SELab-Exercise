package strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompressorTest {

    String text = "Apache Commons BCEL\n" +
            "Apache Commons BeanUtils\n" +
            "Apache Commons BSF\n" +
            "Apache Commons Chain\n" +
            "Apache Commons CLI";

    @Test
    public void testCompressor() throws Exception {
        Compressor c = new Compressor(text);
        c.setEncryption(Compressor.EncryptionStrategy.NO_ENCRYPTION);
        assertEquals("QXBhY2hlIENvbW1vbnMgQkNFTApBcGFjaGUgQ29tbW9ucyBCZWFuVXRpbHMKQXBhY2hlIENvbW1vbnMgQlNGCkFwYWNoZSBDb21tb25zIENoYWluCkFwYWNoZSBDb21tb25zIENMSQ==", c.compress());
    }

    @Test
    public void testCompressorAES() throws Exception {
        Compressor c = new Compressor(text);
        c.setEncryption(Compressor.EncryptionStrategy.BLOW_FISH);
        assertEquals("5cEkh/yJxFwCD7ns320Wgu0VPUwn51+19LYPwoR1jVBbZARBF5IoJWZwznLKx2xUMY27cIFXKoyQugmgXxExtS+tE3cWgVB46hONhI88m28aWbQl343m2B56dOcK5nfe2SEmT32KhYdDxhzZarNIF/oGeSq2klD66H8mrqC6GjAXkQ1e3DeDRYFgF3lg4mxi", c.compress());
    }


}
