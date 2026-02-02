import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Linh", "Nam");
        Student s2 = new Student(2, "Đức", "Nam");
        Student s3 = new Student(3, "Anh", "Nữ");

        StudentManager studentManager = new StudentManager();
        studentManager.add(s1);
        studentManager.add(s2);
        studentManager.add(s3);

        ArrayList<Student> list = studentManager.getAll();
        System.out.println("Before: ");
        for (Student s: list) {
            System.out.println(s); // Id: 1 - Name: Linh - Gender: Nam
        }

//        studentManager.remove(1);
        Student newStudent = new Student(21, "Ning2", "Nam");
        studentManager.update(1, newStudent);
        System.out.println("After: ");
        for (Student s: list) {
            System.out.println(s); // Id: 1 - Name: Linh - Gender: Nam
        }

        Student studentFined = studentManager.getById(3);
        System.out.println("Student: " + studentFined);

        System.out.println("List find by name contains");
        ArrayList<Student> listFilter = studentManager.getByNameContains("n");
        for (Student s: listFilter) {
            System.out.println(s);
        }
    }
}


