import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {

        Quotes quotes = new Quotes(1,"First quotes", "Bob");
        Quotes quotes2 = new Quotes(2,"Second quotes", "kay");
        Quotes quotes3 = new Quotes(3,"Third quotes", "Mike");
        Quotes quotes4 = new Quotes(4,"Fourth quotes", "John");

        Author author = new Author(1,"John", "Brown");
        Author author2 = new Author(2,"Sam","Lansford");
        Author author3 = new Author(3,"Jay","Rabbit");
        Author author4 = new Author(4,"May","Bake");

        Albums albums = new Albums(1, "Michael Jackson", "Thriller", 1982, "Pop/Rock/R&B", 47.3);
        Albums albums2 = new Albums(2, "AC/DC", "Back in Black", 1980, "Hard Rock", 26.1);
        Albums albums3 = new Albums(3,"Pink Floyd", "The Dark Side of the Moon", 1973, "Progressive Rock", 24.2);
        Albums albums4 = new Albums(4, "Meat Loaf", "Bat Out of Hell", 1977, "Hard Rock/Progressive Rock", 21.5);

        List<Quotes> quotesList = new ArrayList<>();
        Collections.addAll(quotesList,quotes,quotes2,quotes3,quotes4);

        for (Quotes Quotes : quotesList) {
            System.out.println(quotes.author + " -- " + quotes.content);
        }
    }

}
