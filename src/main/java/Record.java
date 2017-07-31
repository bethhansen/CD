/**
 * Created by Guest on 7/31/17.
 */
public class Record {
    public String artist;
    public String album;
    public int year;
    public int price;

    public Record (String artist, String album, int year, int price) {
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.price = price;
}
    public boolean worthBuying (int maxPrice)
    {
        return (price < maxPrice);
    }

}
