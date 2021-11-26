package guop1.Homework.author;

public class AuthorStorage {
    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {

        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;

    }

    public Author getIndex(int index) {

        if (index < 0 || index > authors.length - 1) {
            return null;
        }
        return authors[index];
    }

    private void extend() {

        Author tmp[] = new Author[authors.length + 10];
//        for (int i = 0; i < array.length; i++) {
//            tmp[i] = array[i];
//        }

        System.arraycopy(authors, 0, tmp, 0, authors.length);

        authors = tmp;

    }

    public void print() {
        for (int i = 0; i < authors.length; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) || authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);

            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void changeAuthor(String email, String name, String surname, int age, String gender) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                authors[i].setName(name);
                authors[i].setSurname(surname);
                authors[i].setAge(age);
                authors[i].setGender(gender);
            }
        }
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid");
        }
        for (int i = index + 1; i < size; i++) {
            authors[i - 1] = authors[i];
        }
        size--;
    }

    public void deleteByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                deleteByIndex(i);
            }
        }
    }

}
