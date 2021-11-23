package guop1.Homework.author;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void addBook(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;

    }

    public void extend() {
        Book temp[] = new Book[books.length + 10];
        System.arraycopy(books, 0, temp, 0, books.length);
        books = temp;
    }

    public void print() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);

        }

    }

    public void searchBook(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }

        }
    }

}

