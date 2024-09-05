package ua.com.javarush.gnew;

import ua.com.javarush.gnew.domainator.Command;
import ua.com.javarush.gnew.domainator.EncryptingData;
import ua.com.javarush.gnew.encrypt.Encrypt;
import ua.com.javarush.gnew.encrypt.Encryptmpl;
import ua.com.javarush.gnew.encrypt.PathCreate;
import ua.com.javarush.gnew.encrypt.PathCreateImpl;
import ua.com.javarush.gnew.provide.EncryptingProvide;
import ua.com.javarush.gnew.read.FileReade;
import ua.com.javarush.gnew.read.FileReadImpl;
import ua.com.javarush.gnew.validator.Validator;
import ua.com.javarush.gnew.validator.ValidatorImpl;
import ua.com.javarush.gnew.create.FileCreate;
import ua.com.javarush.gnew.create.FileCreateImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sourceFilePath;
        String command;
        int key = 0;
        EncryptingData encryptingData;
        Validator fileValidator = new ValidatorImpl();
        FileReade fileReader = new FileReadImpl();
        Encrypt encrypter = new Encryptmpl();
        PathCreate pathCreater = new PathCreateImpl();
        FileCreate fileWriter = new FileCreateImpl();
        EncryptingProvide encryptingProvider = new EncryptingProvide(fileValidator,
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
