package guop1.Homework.author;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;
    private AuthorStorage authorStorage = new AuthorStorage();

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

    public void searchBookByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail() == email) {
                System.out.println(books[i]);
            }
        }
    }

    public void countBooksByAuthor(String email) {
        int bookCount = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail() == email) {
                bookCount += 1;
            }
        }
        System.out.println(bookCount);
    }

    public void changeBookAuthor(String title, String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle() == title) {
                Author byEmail = authorStorage.getByEmail(email);
                books[i].setAuthor(byEmail);
            }
        }
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid");
        }
        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];
        }
        size--;
    }

    public void deleteByAuthor(String email) {
        Author byEmail = authorStorage.getByEmail(email);
        if (byEmail != null) {
            for (int i = 0; i < size; i++) {
                if (books[i].getAuthor().equals(byEmail)) {
                    deleteByIndex(i);
                }
            }
        }
    }

    public void deleteByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle() == title) {
                deleteByIndex(i);
            }
        }
    }
}

