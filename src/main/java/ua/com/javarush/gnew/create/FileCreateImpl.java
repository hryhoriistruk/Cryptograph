package ua.com.javarush.gnew.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCreateImpl implements FileCreate {
    @Override
    public void createFile(String resultText, String resultFilePath) {

        try {
            Files.writeString(Paths.get(resultFilePath), resultText);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't create file", e);
        }
    }
}
