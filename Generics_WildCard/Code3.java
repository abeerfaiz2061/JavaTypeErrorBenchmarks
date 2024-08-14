import java.util.ArrayList;
import java.util.Iterator;

class Movie {
    private String title;
    private Rating rating;

    public Movie(String title, Rating rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Rating getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}

enum Rating {
    G, PG, PG13, R, MATURE
}

public class Code3 {

    public static void main(String[] args) {

        ArrayList<Double> objecten = new ArrayList<>();
        objecten.add((double) 1);
        objecten.add(5.4);

        objecten.add(new Movie("Inception", Rating.MATURE));

        Iterator<Double> iterator = objecten.iterator();
        double total = 0;
        while (iterator.hasNext()) {
            total += iterator.next();
        }
        System.out.println(total);

        printItems(objecten);
    }

    public static void printItems(ArrayList<?> items) {
        items.add(new Movie("Inception", Rating.MATURE));
    }
}

// Original Code Credits - https://github.com/custersnele/JavaAdv_H5_Generics