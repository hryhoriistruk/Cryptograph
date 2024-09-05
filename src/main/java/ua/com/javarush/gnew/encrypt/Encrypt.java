package ua.com.javarush.gnew.encrypt;

import ua.com.javarush.gnew.domainator.EncryptingData;

public interface Encrypt {
    String encryptText(String sourceText, EncryptingData encryptingData);
}
