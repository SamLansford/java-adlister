
public class Albums {
    int id;
    String artist;
    String name;
    int release_date;
    String genre;
    double sales;

    public Albums(int id, String artist, String name, int release_date, String genre, double sales) {
        this.id = id;
        this.release_date = release_date;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist() {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
