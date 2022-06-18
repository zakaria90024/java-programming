package com.gmail.shihab4t.chapter16.appendix.P19.morese.code;

import java.util.regex.Pattern;

public class MorseString {
    private static final String  CHAR_SEPARATOR = " ", WORD_SEPARATOR = "/", DOT = ".", DASH = "-";

    private static final Pattern VALID_MORSE_PATTERN = Pattern.compile("{" + Pattern.quote(DASH) +
            "|" + Pattern.quote(DOT) +
            "|" + Pattern.quote(WORD_SEPARATOR) +
            "|\\s)*");

    private final String text, codes;


    public MorseString(String codes) {
        if (!isValidMorse(codes)) {
            throw new IllegalArgumentException(codes + " is not a valid Morse Code");
        }
        this.text = !codes.isEmpty() ? translate(codes) : codes;
        this.codes = codes;
    }

    public static boolean isValidMorse(CharSequence ch) {
        return VALID_MORSE_PATTERN.matcher(ch).matches();
    }

    private String translate(String code) {
        String[] words = code.split(WORD_SEPARATOR);
        StringBuilder result = new StringBuilder();

        for (String word: words) {
            String[] letters = word.trim().split(CHAR_SEPARATOR);
            for (String letter : letters) {
                result.append(MorseCode.decode(letter));
            }
            result.append(CHAR_SEPARATOR);
        }

        return result.substring(0, result.length() - 1);
    }

    public static MorseString parse(String text) {
        if (text == null || text.isEmpty()) {
            return new MorseString("");
        } else if (!text.matches("[\\s\\dA-Za-z*]")) {
            throw new IllegalArgumentException("String to complicated");
        }
        int length = text.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                result.append(WORD_SEPARATOR).append(CHAR_SEPARATOR);
                continue;
            }
            result.append(MorseCode.encode(text.charAt(i))).append(CHAR_SEPARATOR);
        }
        return new MorseString(result.toString().trim());
    }

    /**
     * Returns the code as a String
     * e.g. if the object represents "hi" in Morse,
     * it returns ".... .."
     */

    @Override
    public String toString() {
        return codes;
    }

    /**
     * Returns the result of the translations
     * e.g. if the object represents "hi" in Morse,
     * it returns "hi"
     */

    public String asText() {
        return text;
    }
}
