package ua.com.javarush.gnew;

import ua.com.javarush.gnew.domain.Command;
import ua.com.javarush.gnew.domain.EncryptingData;
import ua.com.javarush.gnew.encryption.Encrypter;
import ua.com.javarush.gnew.encryption.EncrypterImpl;
import ua.com.javarush.gnew.encryption.PathCreater;
import ua.com.javarush.gnew.encryption.PathCreaterImpl;
import ua.com.javarush.gnew.provider.EncryptingProvider;
import ua.com.javarush.gnew.reader.FileReader;
import ua.com.javarush.gnew.reader.FileReaderImpl;
import ua.com.javarush.gnew.validation.Validator;
import ua.com.javarush.gnew.validation.ValidatorImpl;
import ua.com.javarush.gnew.creation.FileCreater;
import ua.com.javarush.gnew.creation.FileCreateImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sourceFilePath;
        String command;
        int key = 0;
        EncryptingData encryptingData;
        Validator fileValidator = new ValidatorImpl();
        FileReader fileReader = new FileReaderImpl();
        Encrypter encrypter = new EncrypterImpl();
        PathCreater pathCreater = new PathCreaterImpl();
        FileCreater fileWriter = new FileCreateImpl();
        EncryptingProvider encryptingProvider = new EncryptingProvider(fileValidator,
            fileReader, encrypter, pathCreater, fileWriter);

        if (args.length == 0) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Input File Path: ");
                System.out.println("For example: C:\\workspaceIntellij\\Cryptograph\\src\\main\\resources\\SourceTextEN.txt");
                sourceFilePath = scanner.nextLine();
                System.out.println("Input command: ");
                System.out.println("For example: "
                    + Command.e + ", "
                    + Command.d + ", "
                    + Command.bf);
                command = scanner.nextLine();
                if (!Command.bf.equals(command)) {
                    System.out.println("Input key (it must be a number, if you chose null, the text doesn't change): ");
                    key = scanner.nextInt();
                }
            }
        } else {
            sourceFilePath = args[1];
            command = args[0];
            if (args.length > 2) {
                key = Integer.parseInt(args[2]);
            }
        }
        encryptingData = EncryptingData.builder()
            .withSourceTextPath(sourceFilePath)
            .withCommand(command)
            .withKey(key).build();
        encryptingProvider.provideEncrypting(encryptingData);
        System.out.println("File was successfully created");
    }
}
