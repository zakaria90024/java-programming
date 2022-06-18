package com.gmail.shihab4t.chapter03;

public class C16EscapeSequenceDemoWithTextBlock {
    // Text Block feature of Java15
    public static void main(String[] args) {
        String paragraph = """
                The roaring fans sow
                their beloved "Tigers" create another
                \tbit of history in their favorite
                den last night.""";
        System.out.println(paragraph);
    }
}
