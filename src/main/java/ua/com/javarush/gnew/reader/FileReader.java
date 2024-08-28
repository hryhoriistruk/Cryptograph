package ua.com.javarush.gnew.reader;

import ua.com.javarush.gnew.domain.EncryptingData;

public interface FileReader {
    String read(EncryptingData encryptingData);
}
