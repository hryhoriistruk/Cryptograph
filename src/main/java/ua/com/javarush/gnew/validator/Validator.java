package ua.com.javarush.gnew.validator;

import ua.com.javarush.gnew.domainator.EncryptingData;

public interface Validator {
    void validate(EncryptingData encryptingData);
}
