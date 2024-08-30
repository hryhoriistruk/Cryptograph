package ua.com.javarush.gnew.domainator;

public enum Command {
    e, d, bf;

    public boolean equals(String value){
        return this.name().equalsIgnoreCase(value);
    }
}
