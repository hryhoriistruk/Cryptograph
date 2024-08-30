package ua.com.javarush.gnew.encryption;

import ua.com.javarush.gnew.domain.EncryptingData;

public interface PathCreater {
    String createPath(EncryptingData encryptingData);
}
