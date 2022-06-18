package com.gmail.shihab4t.chapter16.appendix.P19.morese.code;

public class MorseCodeTranslator {
    public MorseString toMorseString(String text) {
        return MorseString.parse(text);
    }

    public String toText(String morseCode) {
        MorseString morseString = new MorseString(morseCode);
        return  morseString.asText();
    }
}
