package practice.demo.playload.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummyDataGenerator {

    public static List<Student> generateDummyStudents() {
        List<Student> students = new ArrayList<>();

        // 1. Prepare shared Engineering Department
        Department engineeringDept = new Department();
        engineeringDept.setDepartmentName("Computer Science and Engineering");
        engineeringDept.setDepartmentCode("CSE-001");

        // 2. Prepare shared Engineering Subjects
        Subjects s1 = new Subjects();
        s1.setTitle("Data Structures and Algorithms");
        s1.setSubjectCode("CS101");

        Subjects s2 = new Subjects();
        s2.setTitle("Operating Systems");
        s2.setSubjectCode("CS102");

        List<Subjects> engineeringSubjects = Arrays.asList(s1, s2);

        // 3. Generate 10 Students
        for (int i = 1; i <= 10; i++) {
            Student student = new Student();
            student.setName("Student Name " + i);
            student.setAge(20 + i);
            student.setDepartment(engineeringDept);
            student.setSubjects(engineeringSubjects);

            students.add(student);
        }

        return students;
    }
}