package com.gmail.shihab4t.chapter13;

import java.util.Locale;

public class P21AvailableLocale {
    public static void main(String[] args) {
        for (Locale availableLocale : Locale.getAvailableLocales()) {
            var language = availableLocale.getLanguage();
            var displayCountry = availableLocale.getDisplayCountry();
            System.out.println("Language = " + language + ", " + "displayCountry = " + displayCountry);
        }
    }
}
