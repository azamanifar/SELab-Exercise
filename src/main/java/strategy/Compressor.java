package strategy;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.util.Base64;

public class Compressor {

    enum EncryptionStrategy { // TODO make this enum a class that has behaviour encrypt() and use it directly
        NO_ENCRYPTION, BLOW_FISH
    }

    private String content;
    private EncryptionStrategy encryption = EncryptionStrategy.NO_ENCRYPTION;

    public Compressor(String content) {
        this.content = content;
    }

    public void setEncryption(EncryptionStrategy encryption) {
        this.encryption = encryption;
    }

    private String innerCompress(String input) throws IOException {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public static String encryptBlowfish(String plainText) throws Exception {
        byte[] KeyData = "SELab".getBytes();
        SecretKeySpec KS = new SecretKeySpec(KeyData, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, KS);
        return Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes("UTF-8")));
    }

    public String compress() throws Exception {
        String compressed = innerCompress(content);
        // TODO firstly, object-oriented designers hate "Switch" cause it makes code complex and illegible
        // TODO --> we prefer "encryption" object does the encryption itself
        switch (encryption) {
            case NO_ENCRYPTION:
                return compressed;
            case BLOW_FISH:
                return encryptBlowfish(compressed);
        }
        return "Unknown Encryption Parameter";
    }

}