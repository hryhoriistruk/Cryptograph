package ua.com.javarush.gnew.read;

import ua.com.javarush.gnew.domainator.EncryptingData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileReadImpl implements FileReade {
    @Override
    public String read(EncryptingData encryptingData) {
        String sourceText;
        try {
            sourceText = Files.readString(Paths.get(encryptingData.getSourceTextPath()));
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't read file", e);
        }
        return sourceText;
    }
}
