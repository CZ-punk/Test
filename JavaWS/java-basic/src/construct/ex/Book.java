package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;

    }
    Book(String name, String author) {
        this(name, author, 0);
    }
    Book() {
        this("", "", 0);
    }
    public void dispalyInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
