import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblio {
    public static void main(String[] args) {
        List<Author> myAuthors = new ArrayList<>();
        List<Books> myBooks = new ArrayList<>();

        Biblioteca b1 = new Biblioteca(myAuthors, myBooks);
        Scanner in = new Scanner(System.in);
        boolean stayInLoop = true;
        while (stayInLoop) {
            System.out.println("choose an option:");
            System.out.println("a) adauga autori");
            System.out.println("b) printeaza lista autorilor");
            System.out.println("c) sterge autori");
            System.out.println("d) adauga carti");
            System.out.println("e) printeaza carti");
            System.out.println("f) sterge carti");
            System.out.println("g) cauta carti dupa autor");
            System.out.println("h) cauta cartea cea mai bine cotata dupa autor");
            System.out.println("i) exit");
            while (!in.hasNext("[abcdefghi]")) {
                System.out.println("Not from list. Chose another option");
                in.next();
            }
            Character input = in.next().charAt(0);
            switch (input) {
                case 'a':
                    System.out.println("introdu nume autor:");
                    String name = in.next();
                    System.out.println("introdu email autor:");
                    String email = in.next();
                    System.out.println("introdu gen autor:");
                    String gender = in.next();
                    System.out.println("introdu tel autor:");
                    String tel = in.next();
                    Author myAuthor = b1.createAuthor(name, email, gender, tel);
                    b1.addAuthors(myAuthor);
                    break;
                case 'b':
                    b1.printAuthorsList();
                    break;
                case 'c':
                    System.out.println("Introduceti numele autorului care doresti sa il stergi din lista: ");
                    String authorToRemove = in.next();
                    b1.removeAuthors(authorToRemove);
                    break;
                case 'd':
                    System.out.println("introdu nume carte:");
                    String name1 = in.next();
                    System.out.println("introdu numarul de pagini:");
                    int noOfPages = in.nextInt();
                    System.out.println("introdu rating-ul cartii:");
                    double rating = in.nextDouble();
                    System.out.println("Autorii disponibili sunt mai jos. Alege un nume:");
                    b1.printAuthorsList();
                    String authorName = in.next();
                    Books myBook = b1.createBooks(name1, noOfPages, rating, b1.returnAuthor(authorName));
                    b1.addBooks(myBook);
                    break;
                case 'e':
                    b1.printBooksList();
                    break;
                case 'f':
                    System.out.println("Introduceti numele cartii care doriti sa o stergi din lista: ");
                    String bookToRemove = in.next();
                    b1.removeBooks(bookToRemove);
                    break;
                case 'g':
                    System.out.println("Introduceti numele autorului ale carui carti vreti sa vizualizati ");
                    String nameAuthorSearchForBooks = in.next();
                    b1.returnBook(nameAuthorSearchForBooks);
                    break;
                case 'h':
                    System.out.println("Introduceti numele autorului a carui cea mai cotata carte doriti sa vizualizati ");
                    String nameAuthorSearchForHighestBook = in.next();
                    b1.returnBookHighestRating(nameAuthorSearchForHighestBook);
                    break;
                case 'i':
                    System.out.println("you exit");
                    stayInLoop = false;


            }
        }

    }


}

