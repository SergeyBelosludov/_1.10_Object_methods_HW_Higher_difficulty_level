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
        System.out.println("Library:");
        for (var i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        return "";
    }
}