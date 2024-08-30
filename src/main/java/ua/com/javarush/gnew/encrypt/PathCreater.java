package ua.com.javarush.gnew.encrypt;

import ua.com.javarush.gnew.domainator.EncryptingData;

public interface PathCreater {
    String createPath(EncryptingData encryptingData);
}
