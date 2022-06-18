package com.gmail.shihab4t.chapter16.appendix;

public class P07Student implements Cloneable{
    private String name;
    private P06Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public P06Course getCourse() {
        return course;
    }

    public void setCourse(P06Course course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
