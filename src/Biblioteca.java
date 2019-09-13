import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private List<Author> myAuthors = new ArrayList<>();
    private List<Books> myBooks = new ArrayList<>();

    public Biblioteca(List<Author> myAuthors, List<Books> myBooks) {
        this.myAuthors = myAuthors;
        this.myBooks = myBooks;
    }

    public List<Author> getMyAuthors() {
        return myAuthors;
    }

    public List<Books> getMyBooks() {
        return myBooks;
    }

    public void setMyAuthors(List<Author> myAuthors) {
        this.myAuthors = myAuthors;
    }

    public void setMyBooks(List<Books> myBooks) {
        this.myBooks = myBooks;
    }

    public Author createAuthor(String name, String email, String gender, String tel) {
        return new Author(name, email, gender, tel);
    }

    public void addAuthors(Author myAuthor) {
        myAuthors.add(myAuthor);
    }

    public void removeAuthors(String name) {
        List<Author> deleteAuthors = new ArrayList<>();

        for (Author a : myAuthors) {
            if (a.getName().equals(name)) {
                deleteAuthors.add(a);
            }
        }

        for (Author deleteAuthor : deleteAuthors) {
            myAuthors.remove(deleteAuthor);
        }
    }

    public void printAuthorsList() {
        System.out.println("Lista de autori contine urmatorii: ");
        for (Author a : myAuthors) {
            System.out.println(a);
        }
    }

    public Author returnAuthor(String name) {
        for (Author a : myAuthors) {
            if (a.getName().equals(name))
                return a;
        }
        return null;
    }

    public Books createBooks(String name, int numberOfPages, double rating, Author myAuthor) {
        return new Books(name, numberOfPages, rating, myAuthor);
    }

    public void addBooks(Books myBook) {
        myBooks.add(myBook);
    }

    public void removeBooks(String bookName) {
        List<Books> deleteBooks = new ArrayList<>();

        for (Books b : myBooks) {
            if (b.getName().equals(bookName)) {
                deleteBooks.add(b);
            }
        }

        for (Books deleteBook : deleteBooks) {
            myBooks.remove(deleteBook);
        }
    }

    public void returnBook(String name) {
        String searchForAuthor = "a";
        //List<String> searchForAuthor = new ArrayList<>();
        List<Books> booksReturned = new ArrayList<>();
        for (Author a : myAuthors) {
            if (a.getName().equals(name))
                searchForAuthor = a.getName();
        }
        for (Books b : myBooks) {
            if (b.getMyList().getName().equals(searchForAuthor))
                booksReturned.add(b);
        }
        System.out.println("Cartile scrise de autorul ales sunt: ");
        for (Books b : booksReturned) {
            System.out.println(b.getName());
        }
    }

    public void returnBookHighestRating(String name) {
        String searchForAuthor = "a";
        //List<String> searchForAuthor = new ArrayList<>();
        List<Books> booksReturned = new ArrayList<>();
        List<Double> booksRating = new ArrayList<>();
        for (Author a : myAuthors) {
            if (a.getName().equals(name))
                searchForAuthor = a.getName();
        }
        for (Books b : myBooks) {
            if (b.getMyList().getName().equals(searchForAuthor))
                booksReturned.add(b);
        }

        for (Books b : booksReturned) {
            booksRating.add(b.getRating());
        }
        Double i = Collections.max(booksRating);

        for (Books b : booksReturned) {
            if (b.getRating() == i)
                System.out.println("Cartea cu cel mai mare rating scrisa de autorul ales este: " + b.getName());

        }

    }


    public void printBooksList() {
        System.out.println("Lista de carti contine urmatoarele: ");
        for (Books b : myBooks) {
            System.out.println(b);
        }
    }


}
