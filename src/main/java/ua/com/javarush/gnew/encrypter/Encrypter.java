package ua.com.javarush.gnew.encrypter;

import ua.com.javarush.gnew.domain.EncryptingData;

public interface Encrypter {
    String encryptText(String sourceText, EncryptingData encryptingData);
}
