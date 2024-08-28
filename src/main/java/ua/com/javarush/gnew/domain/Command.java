package ua.com.javarush.gnew.domain;

public enum Command {
    ENCRYPT, DECRYPT, BRUTE_FORCE;

    public boolean equals(String value){
        return this.name().equalsIgnoreCase(value);
    }
}
