import java.util.ArrayList;

public class BookShelf {

    private ArrayList<Book> books;
    private final int MAX_CAPACITY = 12;

    public BookShelf() {
        books = new ArrayList<>();

    }

    public void addBook(Book newBook) {
        int index = books.indexOf(newBook);
        if (index == -1) {
            books.add(newBook);
        }else{
            System.out.println("The book: " + newBook.getTitle() + " is aready in the bookshelf\n");
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public boolean isBookInShelf(Book book) {
        return books.contains(book);
    }

    public void displayBook(Book book) {
        int index = books.indexOf(book);
        Book theBook = books.get(index);
        System.out.println(theBook);

    }

    public void displayAllBooks() {
        for (Book aBook : books) {
            System.out.println(aBook.toString());
        }
    }

    public String toString() {
        String st = "";
        st += "Bookshelf max capacity: " + this.MAX_CAPACITY;
        st += "\n";
        st += "Number books on the shelf: " + this.books.size();
        st += "\n";
        return st;
    }

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();

        Book myBook1 = new Book("Java All-in-One For Dummies",
                "Doug Lowe", "1119986648",
                34.99, 21, 7);

        Book myBook2 = new Book("Mastering Java",
                "William Buchanan", "NA",
                36.99, 81, 1998);

        Book myBook3 = new Book("Java in easy steps",
                "Mike McGrath", "029574426X",
                10.99, 10, 7);

        Book myBook4 = new Book("Effective Java",
                "Joshua Bloch", "0134685997",
                40.49, 6, 3);

        bookShelf.addBook(myBook1);
        bookShelf.addBook(myBook2);
        bookShelf.addBook(myBook3);
        bookShelf.addBook(myBook4);
        bookShelf.displayAllBooks();

        bookShelf.addBook(myBook1);

        System.out.println(bookShelf.toString());
    }

}
