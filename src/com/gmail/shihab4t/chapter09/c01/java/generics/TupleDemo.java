package com.gmail.shihab4t.chapter09.c01.java.generics;

public class TupleDemo {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Shihab" , "Mahamud");
        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Nafis", 45);
        person.showTypes();


        Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple
                = new Tuple<String, Tuple<Integer, Integer>>("Tuple", new Tuple<Integer, Integer>(45, 89));
        tupleInsideTuple.showTypes();

        // > java 7
        Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple2
                = new Tuple<>("Tuple", new Tuple<>(45, 89));
        tupleInsideTuple2.showTypes();

//        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
//        Map<String, List<String>> anagrams2 = new HashMap<>();
    }
}
