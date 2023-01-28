import java.lang.reflect.Array;
import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Librarian> librarians;
    private ArrayList<Books> books;
    private ArrayList<Customer> customers;
    private int Number_Books;
    private int Number_Employees;
    private int Books_Borrowed;

    public LibrarySystem(ArrayList<Librarian> librarians, ArrayList<Books> books, ArrayList<Customer> customers, int Number_Books, int Number_Employees, int Books_Borrowed) {
        this.librarians = librarians;
        this.books = books;
        this.customers = customers;
        this.Number_Books = Number_Books;
        this.Number_Employees = Number_Employees;
        this.Books_Borrowed = Books_Borrowed;
    }

    public LibrarySystem(Librarian librarian, Books books, Customer customers) {
        this.librarians.add(librarian);
        this.books.add(books);
        this.customers.add(customers);
    }
}

