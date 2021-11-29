package guop1.Homework.education;


/**
 * Lesson(name, duration(դասընթացի տևողությունն է), lecturerName(դասախոսի անունն է), price(դասընթացի գինն է։))
 * Student(name, surname, age, email, phone, lesson(թե որ դասընթացին է մասնակցում))
 * Ծրագիրը միացնելուց պետք է ունենանք հետևյալ հրամանները՝
 * 0 - EXIT
 * 1 - ADD LESSON (պետք է նույն անունով երկու տարբեր դասընթաց չունենանք)
 * 2 - ADD STUDENT (պետք է նույն իմեյլով երկու ուսանող չունենանք)
 * 3 - PRINT STUDENTS
 * 4 - PRINT STUDENTS BY LESSON
 * 5 - PRINT LESSONS
 * 6 - DELETE LESSON BY NAME
 * 7 - DELETE STUDENT BY EMAIL
 */
public class Lesson {
    private String name;
    private String lecturerName;
    private int price;
    private int duration;

    public Lesson() {
    }

    public Lesson(String name, int duration, String lecturerName, int price){
        this.name = name;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
