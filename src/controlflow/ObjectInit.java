package controlflow;

class Student {
    int id;
    String name;
}

public class ObjectInit {

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.id);
        System.out.println(student.name);

        student.id = 1;
        student.name = "Pont Pont";
        System.out.println(student.id);
        System.out.println(student.name);

        Student student1 = new Student();
        student1.id = 2;
        student1.name = "Wai";
        System.out.println(student1.id);
        System.out.println(student1.name);

        System.out.println(new Student().id);
        System.out.println(new Student().name);

    }
}
