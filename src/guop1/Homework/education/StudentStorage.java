package guop1.Homework.education;

public class StudentStorage {
    private Student[] students = new Student[10];
    private int studentsSize = 0;
    private LessonStorage lessonStorages = new LessonStorage();


public void  addStudent(Student student) {
    if (studentsSize == students.length) {
        extend();
    }
    students[studentsSize++] = student;
}

    private void extend() {
    Student temp[] = new Student[students.length + 10];
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }
        students = temp;
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public void printStudentsByLesson(String name) {
        for (int i = 0; i < studentsSize; i++) {
            if (students[i].getLesson().getName() == name) {
                System.out.println(students[i]);
            }
        }
    }

    public void deletStudentByEmail(String email) {
        for (int i = 0; i < studentsSize; i++) {
            if (students[i].getEmail().equals(email)){
                ArrayUtil.deleteByIndex(students, i, studentsSize);
            }
        }
    }

}
