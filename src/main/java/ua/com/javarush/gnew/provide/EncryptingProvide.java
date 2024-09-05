package ua.com.javarush.gnew.provide;

import ua.com.javarush.gnew.domainator.EncryptingData;
import ua.com.javarush.gnew.encrypt.Encrypt;
import ua.com.javarush.gnew.encrypt.PathCreate;
import ua.com.javarush.gnew.read.FileReade;
import ua.com.javarush.gnew.validator.Validator;
import ua.com.javarush.gnew.create.FileCreate;

public class EncryptingProvide {
    private final Validator fileValidator;
    private final FileReade fileReader;
    private final Encrypt encrypter;
    private final PathCreate pathCreater;
    private final FileCreate fileCreater;

    public EncryptingProvide(Validator fileValidator,
                             FileReade fileReader,
                             Encrypt encrypter,
                             PathCreate pathCreater,
                             FileCreate fileCreater) {
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
