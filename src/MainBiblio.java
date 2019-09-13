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
            System.out.println("f) exit");
            while (!in.hasNext("[abcf]")) {
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
                    String nameToRemove = in.next();
                    b1.removeAuthors(nameToRemove);
                    break;
                case 'f':
                    System.out.println("you exit");
                    stayInLoop = false;


            }
        }

    }


}

