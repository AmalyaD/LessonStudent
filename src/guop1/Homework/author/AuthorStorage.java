package guop1.Homework.author;

public class AuthorStorage {
    private Author[] array = new Author[10];
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

        Author tmp[] = new Author[array.length + 10];
//        for (int i = 0; i < array.length; i++) {
//            tmp[i] = array[i];
//        }

        System.arraycopy(array, 0, tmp, 0, array.length);

        array = tmp;

    }

    public void print() {
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public void searchAuthor(String keyword) {
        for (int i = 0; i < size ; i++) {
            if(array[i].getName().contains(keyword) || array[i].getSurname().contains(keyword)) {
                System.out.println(array[i]);
            }
        }
    }
    public void searchAuthorByAge(int minAge , int maxAge) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAge() >= minAge &&
            array[i].getAge() <= maxAge) {
                System.out.println(array[i]);

            }

        }
    }

}
