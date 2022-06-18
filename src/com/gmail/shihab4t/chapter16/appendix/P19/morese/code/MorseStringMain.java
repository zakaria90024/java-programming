package com.gmail.shihab4t.chapter16.appendix.P19.morese.code;

public class MorseStringMain {
    public static void main(String[] args) {
        MorseCodeTranslator translator = new MorseCodeTranslator();
        MorseString helloWorld = translator.toMorseString("Hello World");
        System.out.println(helloWorld);

        String text = translator.toText(".. / ._.. --- ...- . / .--- .- ...- .-");
        System.out.println(text);
    }
}
