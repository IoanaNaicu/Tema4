import java.util.ArrayList;
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

    public void removeBook(String name) {
        List<Books> deleteBooks = new ArrayList<>();
        for (Books b : myBooks) {
            if (b.getName().equals(name)) {
                deleteBooks.add(b);
            }
        }

        for (Books deleteBook : deleteBooks) {
            myBooks.remove(deleteBook);
        }


    }


    public void printBooksList() {
        System.out.println("Lista de carti contine urmatorele: ");
        for (Books b : myBooks) {
            System.out.println(b);
        }
    }


}
