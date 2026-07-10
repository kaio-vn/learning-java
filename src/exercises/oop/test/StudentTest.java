package exercises.oop.test;

import exercises.oop.domain.Student;

public class StudentTest {
    public static void main(String[] args) {


        // Variavel de referencia - Objeto de referencia.

        Student student = new Student();

        student.name = "Kaio";
        student.age = 22;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

    }
}
