package ua.com.javarush.gnew.validation;

import ua.com.javarush.gnew.domain.Command;
import ua.com.javarush.gnew.domain.EncryptingData;

import java.io.File;
import java.nio.file.InvalidPathException;

public class ValidatorImpl implements Validator {
    @Override
    public void validate(EncryptingData encryptingData) {
        validateCommand(encryptingData.getCommand());
        validateFilePath(encryptingData.getSourceTextPath());
        if (encryptingData.getKey() != 0) {
            validateKey(encryptingData.getKey());
        }
    }

    private void validateKey(int key) {
        if (key < 0) {
            throw new IllegalArgumentException("Key can't be negative");
        }
    }

    private static void validateFilePath(String sourceFilePath) {
        if (sourceFilePath == null) {
            throw new IllegalArgumentException("File path is null");
        } else if (sourceFilePath.isEmpty()) {
            throw new IllegalArgumentException("File path is empty");
        } else if (sourceFilePath.trim().isEmpty()) {
            throw new IllegalArgumentException("File path contains only spaces or (and) tabs");
        }

        File sourceFile = new File(sourceFilePath);
        if (sourceFile.isDirectory()) {
            throw new InvalidPathException("File is directory", "There is some problem ");
        } else if (!sourceFile.exists()) {
            throw new InvalidPathException("File doesn't exist", "There is some problem ");
        } else if (sourceFile.length() <= 0) {
            throw new InvalidPathException("File is empty", "There is some problem ");
        }
    }

    private static void validateCommand(String command) {
        if (command == null) {
            throw new IllegalArgumentException("Command is null");
        } else if (command.isEmpty()) {
            throw new IllegalArgumentException("Command is empty");
        } else if (command.trim().isEmpty()) {
            throw new IllegalArgumentException("Command contains only spaces or tabs");
        } else if (!Command.e.equals(command)
            && !Command.d.equals(command)
            && !Command.bf.equals(command)) {
            throw new IllegalArgumentException("You enter wrong command, please chose between: "
                + Command.e +", "
                + Command.d + ", "
                + Command.bf);
        }
    }
}
