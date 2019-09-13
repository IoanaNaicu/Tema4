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

    public Author createAuthor(String name, String email, String gender, String tel){
       return new Author(name, email, gender, tel);
    }

    public void addAuthors(Author myAuthor){
        myAuthors.add(myAuthor);
    }

    public void removeAuthors(String name){
        List<Author> deleteAuthors = new ArrayList<>();

        for (Author a: myAuthors){
            if(a.getName().equals(name)) {
                deleteAuthors.add(a);
            }
        }

        for (Author deleteAuthor: deleteAuthors){
            myAuthors.remove(deleteAuthor);
        }
    }



    public void printAuthorsList(){
        System.out.println("Listaa de autori contine urmatorii: ");
        for (Author a : myAuthors) {
            System.out.println(a);
        }
    }

//    public void addBooks(Books myBook){
//        myBooks.add(myBook);
//    }

    //public void deleteAuthor()

}
