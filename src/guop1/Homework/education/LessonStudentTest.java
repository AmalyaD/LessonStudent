package guop1.Homework.education;

import guop1.Homework.author.Author;

import java.util.Scanner;

/**
 * * 0 - EXIT
 * * 1 - ADD LESSON (պետք է նույն անունով երկու տարբեր դասընթաց չունենանք)
 * * 2 - ADD STUDENT (պետք է նույն իմեյլով երկու ուսանող չունենանք)
 * * 3 - PRINT STUDENTS
 * * 4 - PRINT STUDENTS BY LESSON
 * * 5 - PRINT LESSONS
 * * 6 - DELETE LESSON BY NAME
 * * 7 - DELETE STUDENT BY EMAIL
 */

public class LessonStudentTest {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {

        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL");


    }

    public static void main(String[] args) {


        lessonStorage.addLesson(new Lesson("java", 3, "Gasparyan", 35000));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deletStudentByEmail();
                    break;
                default:
                    System.out.println("invalid command!");

            }
        }

    }

    private static void deletStudentByEmail() {
        printStudents();
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deletStudentByEmail(email);
        } else {
            System.err.println("Student does not exists");
        }
    }


    private static void deleteLessonByName() {
        printLessons();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteLessonByName(name);
        } else {
            System.err.println("Lesson does not exists");
        }
    }

    private static void printLessons() {
        System.out.println("please choose lessons's name");
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
    }

    private static void printStudentsByLesson() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        studentStorage.printStudentsByLesson(keyword);

    }

    private static void printStudents() {
        System.out.println("please choose student's name");
        System.out.println("--------");
        studentStorage.print();
        System.out.println("--------");
    }

    private static void addStudent() {



        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("please input student's phone");
        String phone = scanner.nextLine();
        System.out.println("please input student's email");
        String email = scanner.nextLine();
        System.out.println("Please input students's age");
        int age = Integer.parseInt(scanner.nextLine());


        Student student = new Student(name, surname, age, email, phone,lessonStorage);

        if (studentStorage.getByEmail(student.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            studentStorage.addStudent(student);
            System.out.println("Thank you, author was added");
        }

    }


    private static void addLesson() {
        System.out.println("Please input lessons's name");
        String name = scanner.nextLine();
        System.out.println("Please input lessons's lectureName");
        String lectureName = scanner.nextLine();
        System.out.println("please input lessons's duration");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lessons's price");
        int price = Integer.parseInt(scanner.nextLine());


        Lesson lesson = new Lesson(name, duration, lectureName, price);

        if (lessonStorage.getByName(lesson.getName()) != null) {
            System.err.println("Invalid name. Lesson with this name already exists");
        } else {
            lessonStorage.addLesson(lesson);
            System.out.println("Thank you, lesson was added");
        }


    }
}
