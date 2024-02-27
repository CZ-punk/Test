package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.dispalyInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.dispalyInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim" ,700);
        book3.dispalyInfo();
    }
}
