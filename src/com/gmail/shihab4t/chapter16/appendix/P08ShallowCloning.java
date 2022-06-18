package com.gmail.shihab4t.chapter16.appendix;

public class P08ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        P06Course course = new P06Course();
        course.setCode("CSE101");
        course.setName("Structured Programming");

        P07Student student1 = new P07Student();
        student1.setName("Sheldon Cooper");
        student1.setCourse(course);
        P07Student student2 = new P07Student();

        System.out.println(student2.getName());
        System.out.println(student2.getCourse().getName());
        System.out.println(student1.getCourse() == student2.getCourse());
    }
}
