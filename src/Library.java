import java.util.Arrays;

public class Library {
    private final Book[] books;

    public Library(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер должен быть положительным");
        }
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        boolean isBookAdded = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                isBookAdded = true;
            }
            if (isBookAdded) {
                books[i] = book;
                break;
            }
        }
        if (!isBookAdded) {
            throw new IllegalArgumentException("Книга не добавлена, т.к. места в библиотеке больше нет");
        }
    }

    @Override
    public String toString() {
        return "Library:\n" + Arrays.toString(books);
    }

//  Library:
//  Book: The Stand by Author: Stephen King
//  Book: War and Peace by Author: Lev Tolstoy

}