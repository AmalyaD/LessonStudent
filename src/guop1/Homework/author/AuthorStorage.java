package guop1.Homework.author;

public class AuthorStorage {
    private Author[] array = new Author[1];
    private int size = 0;

    public void add(Author author) {
        
        if (size == array.length) {
            extend();
        }
        array[size++] = author;

    }
    public Author getIndex(int index) {

        if ( index < 0 || index > array.length - 1) {
           return null;
       }
        return array[index];
    }

    private void extend() {

        Author tmp[] = new Author[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;

    }

    public void print() {
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i].toString());
        }
    }

}
