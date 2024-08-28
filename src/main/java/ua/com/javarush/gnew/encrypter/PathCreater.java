package ua.com.javarush.gnew.encrypter;

import ua.com.javarush.gnew.domain.EncryptingData;

public interface PathCreater {
    String createPath(EncryptingData encryptingData);
}
