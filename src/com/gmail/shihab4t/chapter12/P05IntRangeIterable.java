package com.gmail.shihab4t.chapter12;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class P05IntRangeIterable implements Iterable<Integer> {
    private final int start;
    private final int end;
    private final boolean rangeClosed;
    private int cursor;

    public P05IntRangeIterable(int start, int end) {
        this(start, end, false);
    }

    public P05IntRangeIterable(int start, int end, boolean rangeClosed) {
        this.start = start;
        this.end = end;
        this.rangeClosed = rangeClosed;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    class IntIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            if (rangeClosed) {
                return cursor <= end;
            } else {
                return cursor < end;
            }
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                cursor = start;
                throw new NoSuchElementException();
            }
            return cursor++;
        }
    }
}

class IntRangeDemo {
    public static void main(String[] args) {
        var range = new P05IntRangeIterable(0, 10);
        for (Integer value : range) {
            System.out.print(value + " ");
        }

        System.out.println();
        IntStream.range(0, 10).forEach(value -> System.out.print(value + " "));
    }
}