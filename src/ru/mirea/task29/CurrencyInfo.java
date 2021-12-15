package ru.mirea.task29;
import java.io.Serializable;
import java.util.Arrays;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String[] quotes;
    private String[] minor;
    private String[] diplomacy;

    public CurrencyInfo(String[] quotes, String[] minor, String[] diplomacy){
        this.quotes = quotes;
        this.minor = minor;
        this.diplomacy = diplomacy;
    }

    public String[] getquotes() {
        return quotes;
    }
    public void setquotes(String[] territoryInfo) {
        this.quotes = quotes;
    }
    public String[] getminor() {
        return minor;
    }
    public void setminor(String[] resourcesInfo) {
        this.minor = minor;
    }
    public String[] getdiplomacy() {
        return diplomacy;
    }
    public void setdiplomacy(String[] diplomacyInfo) {
        this.diplomacy = diplomacy;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "quotes=" + Arrays.toString(quotes) +
                ",\n minor=" + Arrays.toString(minor) +
                ",\n diplomacy=" + Arrays.toString(diplomacy) +
                '}';
    }
}