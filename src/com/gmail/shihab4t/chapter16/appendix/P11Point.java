package com.gmail.shihab4t.chapter16.appendix;

public class P11Point {
    private int x, y;

    public P11Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public P11Point(P11Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
