package guop1.Homework.education;

import less9.ArrayUtil;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size = 0;


    public void  addLesson(Lesson lesson){
        if (size == lessons.length){
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] temp = new Lesson[lessons.length + 10];
        for (int i = 0; i < lessons.length; i++) {
            temp[i] = lessons[i];
        }
       // System.arraycopy(lessons,0,temp,0,lessons.length);
        lessons = temp;
    }


    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)){
                return lessons[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < lessons.length; i++) {
            System.out.println(lessons[i]);
        }
    }


    public void deleteLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
            }
        }
    }
}
