import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(){
        this.students = new ArrayList<>();
    }

    public void add(Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getAll(){
        return this.students;
    }

    public int getSize(){
        return this.students.size();
    }

    public void update(int id, Student student){
        int index = getIndexById(id);
        this.students.set(index, student);
    }

    public Student getById(int id){
        int index = getIndexById(id);
        return this.students.get(index);
    }

    public void remove(int id){
        int index = getIndexById(id);
        this.students.remove(index);
    }

    public int getIndexById(int id) {
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            if (id == student.getId()) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Student> getByNameContains(String keywork){
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : this.students) {
            if (s.getName().contains(keywork)) {
                result.add(s);
            }
        }
        return result;
    }

}
