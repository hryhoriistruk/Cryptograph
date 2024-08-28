// Cryptograph.java (refactored)

package ua.com.javarush.gnew.Cryptograph;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class Cryptograph {
    private KeyPair keyPair;

    public Cryptograph() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        keyPair = generator.generateKeyPair();
    }

    public String encrypt(String message) {
        // TO DO: implement encryption logic here
        return "Encryption not implemented yet.";
    }

    public String decrypt(String encryptedMessage) {
        // TO DO: implement decryption logic here
        return "Decryption not implemented yet.";
    }

    public String getPublicKey() {
        PublicKey publicKey = keyPair.getPublic();
        return Base64.getEncoder().encodeToString(publicKey.getEncoded());
    }

    public String getPrivateKey() {
        PrivateKey privateKey = keyPair.getPrivate();
        return Base64.getEncoder().encodeToString(privateKey.getEncoded());
    }
}
