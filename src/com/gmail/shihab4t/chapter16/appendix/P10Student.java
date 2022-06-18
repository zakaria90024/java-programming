package com.gmail.shihab4t.chapter16.appendix;


public class P10Student implements Cloneable{
    private String name;
    private P09Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public P09Course getCourse() {
        return course;
    }

    public void setCourse(P09Course course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        P10Student clone = (P10Student) super.clone();
        clone.setCourse((P09Course) this.course.clone());

        return clone;
    }
}
