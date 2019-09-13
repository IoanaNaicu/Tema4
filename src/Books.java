import java.util.List;

public class Books {
    private String name;
    private  int numberOfPages;
    //private List<Author> myList;
    private double rating;
    private Author myList;

    public Books(String name, int numberOfPages, double rating, Author myList) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.rating = rating;
        this.myList = myList;
    }

    public String getName() {

        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getRating() {
        return rating;
    }

    public Author getMyList() {
        return myList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setMyList(Author myList) {
        this.myList = myList;
    }

    @Override
    public String toString() {
        return "Cartea se numeste " + name + ", are " + numberOfPages + " pagini, rating de " + rating +
                " si este scrisa de " + myList.getName();
    }
}
