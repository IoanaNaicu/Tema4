import java.util.List;

public class Books {
    private String name;
    private  int numberOfPages;
    private List<Author> myList;

    public Books(String name, int numberOfPages, List<Author> myList) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.myList = myList;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public List<Author> getMyList() {
        return myList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setMyList(List<Author> myList) {
        this.myList = myList;
    }
}
