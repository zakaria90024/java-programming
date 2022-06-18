package com.gmail.shihab4t.chapter16.appendix;


public class ক্যালকুলেটর {
    public int যোগ(int ক, int খ) {
        return ক + খ;
    }

    public int বিয়োগ(int ক, int খ) {
        return ক - খ;
    }

    public static void main(String[] args) {
        int ক = 55;
        int খ = 45;

        ক্যালকুলেটর ক্যালকুলেটর = new ক্যালকুলেটর();
        int যোগফল = ক্যালকুলেটর.যোগ(ক, খ);
        System.out.println("যোগফল = " + যোগফল);
        int বিয়োগফল = ক্যালকুলেটর.বিয়োগ(ক, খ);
        System.out.println("বিয়োগফল = " + বিয়োগফল);
    }
}
