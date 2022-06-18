package com.gmail.shihab4t.chapter07.c05.inheritance;

 final class Password {
    private char[] hash;

    public Password(char[] hash) {
        this.hash = hash;
    }
    // some useful method
}

//public class SaltedPassword extends Password{
//    private String salt;
//
//    public SaltedPassword(char[] hash, String salt) {
//        super(hash);
//        this.salt = salt;
//    }
//}
