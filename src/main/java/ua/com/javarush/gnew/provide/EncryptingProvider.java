package ua.com.javarush.gnew.provide;

import ua.com.javarush.gnew.domainator.EncryptingData;
import ua.com.javarush.gnew.encrypt.Encrypter;
import ua.com.javarush.gnew.encrypt.PathCreater;
import ua.com.javarush.gnew.read.FileReader;
import ua.com.javarush.gnew.validation.Validator;
import ua.com.javarush.gnew.create.FileCreater;

public class EncryptingProvider {
    private final Validator fileValidator;
    private final FileReader fileReader;
    private final Encrypter encrypter;
    private final PathCreater pathCreater;
    private final FileCreater fileCreater;

    public EncryptingProvider(Validator fileValidator,
                              FileReader fileReader,
                              Encrypter encrypter,
                              PathCreater pathCreater,
                              FileCreater fileCreater) {
        this.fileValidator = fileValidator;
        this.fileReader = fileReader;
        this.encrypter = encrypter;
        this.pathCreater = pathCreater;
        this.fileCreater = fileCreater;
    }

    public void provideEncrypting(EncryptingData encryptingData) {
        fileValidator.validate(encryptingData);
        String sourceText = fileReader.read(encryptingData);
        String resultText = encrypter.encryptText(sourceText, encryptingData);
        String resultFilePath = pathCreater.createPath(encryptingData);
        fileCreater.createFile(resultText, resultFilePath);
    }
}
