package singleton;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class Hasher {

    public Hasher() {
    }

    private String getHash(String msg, String algorithm) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(algorithm);
            byte[] thedigest = md.digest(msg.getBytes("UTF-8"));
            return new BigInteger(+1, thedigest).toString(16);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String MD5(String msg) {
        return getHash(msg, "MD5");
    }

    public String SHA256(String msg) {
        return getHash(msg, "SHA-256");
    }

    public String CRC32(String msg) {
        Checksum checksum = new CRC32();
        byte[] bytes = msg.getBytes();
        checksum.update(bytes, 0, bytes.length);
        return new BigInteger(String.valueOf(checksum.getValue())).toString(16);
    }

    public static Hasher getInstance() {
        // TODO: determine what this method is supposed to do
        return null;
    }
}
